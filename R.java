class R{
    static void pro(Object... x){
        for(Object next : x){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        pro(new BB(),new WW(){} ,AA.MONDAY );
    }
}

enum AA{
    MONDAY , TUESDAY
}

class BB{

}

interface WW{

}