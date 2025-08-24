class I{
    static void info(String str, int... a){
        System.out.println(str);
        for(int next:a){
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        info("Rakesh",12,13,23);
    }
}