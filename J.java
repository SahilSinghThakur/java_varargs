class J{
    static void pro(String... names){
        for(String next : names){
            System.out.println(next.toUpperCase().replace("K", "k"));
        }
    }
    public static void main(String[] args) {
        pro("Rakesh");
        pro("Mukesh");
        pro("Lankesh");
        pro("Suresh");
    }
}