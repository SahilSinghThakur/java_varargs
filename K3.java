class K3{
    static void pro(Animal... a){
        for(Animal next:a){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        LivingBeing lb = new Dog();
        pro((Animal)lb);
    }
}