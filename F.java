class F{
    static void print(int ... a){ // varargs 
        int sum = 0;
        for(int next : a){
            sum+=next;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // now the values of the argument are passed as an array
        print(); // {}
        print(10);  //{10}
        print(10,20); //{10,20}
        print(3,4,5); //{3,4,5}
        print(5,6,10,23); // {5,6,10,23}
 
        int[] arr = {1,2,3,5,7,1,5,4,6,9}; // this is an array so it is passed as it is
        print(arr);
    }
}