class B{
    static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add(20);
    }
}

// B.java:6: error: method add in class B cannot be applied to given types;
//         add(20);
//         ^
//   required: int,int
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error