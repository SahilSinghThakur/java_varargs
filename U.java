class U{
    static void pro(String... x){
        
    }
    public static void main(String[] args) {
        String[][] x= {{"UV","MSD","VK"},{"KK","ST"}};
        pro(x);
    }
}

// U.java:7: error: method pro in class U cannot be applied to given types;
//         pro(x);
//         ^
//   required: String[]
//   found:    String[][]
//   reason: varargs mismatch; String[][] cannot be converted to String
// 1 error