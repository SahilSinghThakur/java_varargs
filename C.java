class C{
    static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add(12, 13,5);
    }
}
// C.java:6: error: method add in class C cannot be applied to given types;
//         add(12, 13,5);
//         ^
//   required: int,int
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error