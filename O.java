class O{
    static void pro(String... x,int... y){ // this is not valid because the varargs papramter is the last parameter so we cannot make multiple varargs paramters in a single method

    }
}

// O.java:2: error: varargs parameter must be the last parameter
//     static void pro(String... x,int... y){
//                               ^
// 1 error