class Q{
    static void pro(String nm1,String nm2,int... marks){
        System.out.println(nm1);
        System.out.println(nm2);
        for(int next:marks){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        pro("raj","ram",12,32,55,66);
    }
}