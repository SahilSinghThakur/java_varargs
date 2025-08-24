class Q1{
    static void pro(String[] names,int... marks){
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("~~~~~~~~~~");
        for(int next:marks){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        // pro("raj","ram",12,32,55,66);
        // pro({"raj","ram"},23,54,6,9); 

        pro(new String[]{"raj","ram","pradeep"}, 12,31,78,96,66);
    }
}