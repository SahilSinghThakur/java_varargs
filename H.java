class H{
    static void showNames(String... names){
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println("\n-------------------------");
    }
    public static void main(String[] args) {
        showNames();
        showNames("Guddu", "bablu","golu","Pintu");
        showNames("Harsh","Aksh","Ayush");
    }
}