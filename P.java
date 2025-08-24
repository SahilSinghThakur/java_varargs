public class P {
    static void pro(String x,int... y){
        System.out.println(x);
        for(int next:y){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        byte b = 23;
        short s = 55;
        char c = 66;
        pro("Raju", b,s,c); // here implicit typecasting occurs because this is widening conversion 
    }
}
