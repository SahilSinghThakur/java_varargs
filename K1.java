class K1{
    static void pro(Animal... a){
        System.out.println(a);
        for(Animal next : a){
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        BDog bd = new BDog();
        pro(a,c,d,bd);
    }
}