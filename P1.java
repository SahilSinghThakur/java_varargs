class P1{
    static void pro(int... a){
        for(int i:a)
            System.out.println(i);
    }
    public static void main(String[] args) {
        long l = 45;
        pro((int)l);
        long l1 = 555l;
        long l2 = 214748364888888l;
        pro((int)l1,(int)l2);

    }
}