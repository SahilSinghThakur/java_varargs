class D{
    static void print(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        print();
        print(10);
        print(10,20);
        print(3,4,5);
        print(5,6,10,23);

        int[] arr = {1,2,3,5,7,1,5,4,6,9};
        print(arr);
    }
}