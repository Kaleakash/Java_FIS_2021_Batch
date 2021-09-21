class Demo {
    public static void main(String args[]){
        int []abc={10,20,30,40,50};
        int []num = new int[10];
        System.out.println("Size of array is "+abc.length);
        System.out.println("Size of array is "+num.length);
        System.out.println(abc[0]);
        System.out.println(num[0]);
        System.out.println(num[1]);
        int temp =100;
        for(int i=0;i<num.length;i++){
            num[i]=temp;
            temp++;
        }    
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}