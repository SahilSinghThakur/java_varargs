class L{
    static void pro(String x, int... y){

    }
    public static void main(String[] args) {
        pro(); // non-varargs parameters are mandatory
    }
}

// L.java:6: error: method pro in class L cannot be applied to given types;
//         pro();
//         ^
//   required: String,int[]
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
