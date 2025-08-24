class K2{
    static void pro(Animal... a){
        for(Animal next: a){
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        // pro(new LivingBeing(),new Animal(),new Cat(),new Dog(),new BDog());
        pro((Animal)new LivingBeing(),new Animal(),new Cat(),new Dog(),new BDog()); // here we explicitly cast LivingBeing tp Animal so there is no comiple time error but ar runtime it throws ClassCastException
    }
}