package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Customer;

@Repository
public class CustomerDao {

	@Autowired
	EntityManagerFactory emf;						// like a SessionFactory in Hibernate or like a Connection in JDBC 
	
	public List<Customer> getAllCustomerDetails() {
		EntityManager manager = emf.createEntityManager();				// EntityManager is like a session or PreparedStatement in jdbc 
		 Query qry= manager.createQuery("select c from Customer c");
		List<Customer> listOfCustomer = qry.getResultList();
		return listOfCustomer;
	}
	
	public boolean storeCustomerInfo(Customer cc) {
		try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
					manager.persist(cc);					// save the record 
		tran.commit();
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	public boolean deleteCustomerInfo(int cid) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Customer cc = manager.find(Customer.class, cid);		//1st parameter entity class and 2nd parameter the column which have pk
		if(cc==null) {
					return false;
		}else {
				tran.begin();
				manager.remove(cc);
				tran.commit();
				return true;
		}
	}
	
	public boolean updateCustomerAge(Customer cc) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Customer cust = manager.find(Customer.class, cc.getCid());
		if(cust==null) {
			return false;
		}else {
			tran.begin();
				cust.setAge(cc.getAge());
				manager.merge(cust);							// update the existing object. 
				tran.commit();
				return true;
		}
	}
	
	public Customer findCustomerById(int cid) {
		EntityManager manager = emf.createEntityManager();
		Customer cust = manager.find(Customer.class, cid);
		return cust;
	}
}
