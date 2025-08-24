public class L1 {
    static void pro(String name,int... marks){
        System.out.println(name);
        for(int next : marks){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        // pro(); not ok
        // pro(12,32);  not ok
        pro("Rajnikant"); // non-varargs paramters are mandatory and varargs can have 0 values
        // pro("Kanha","Mukesh"); not ok
        pro("harsh",12,32,45,6);
        
    }
}