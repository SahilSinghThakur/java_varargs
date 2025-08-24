class S{
    // here there is no overriding occurs beacause the parameter body are same varargs implemented arrays so String[] and String... are the same
    static void pro(String... x){
        System.out.println("Hello");
    }
    static void pro(String[] y){
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        pro("Mohan","sohan");
    }
}


// S.java:5: error: cannot declare both pro(String[]) and pro(String...) in S
//     static void pro(String[] y){
//                 ^
// 1 error
