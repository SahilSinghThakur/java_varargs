class T{
    // here overriding is valid but the ambiguity occurs
    static void pro(int... x){
        System.out.println("Hi");
    }
    static void pro(Integer... x){
        System.out.println("hell0");
    }

    public static void main(String[] args) {
        // pro(12,22,333,6); // here ambitguity occurs because it is implicit converted to an wrapper class Integer
        // pro((Integer)12,(Integer)30);
        // pro((int)12,(int)55); 
        pro(new Integer[]{12,32,66});
        pro(new int[]{23,25});

    }
}

// T.java:11: error: reference to pro is ambiguous
//         pro(12,22,333,6);
//         ^
//   both method pro(int...) in T and method pro(Integer...) in T match
// 1 error