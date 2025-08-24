public class K {
    static void pro(Animal... x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        LivingBeing lb = new LivingBeing();
        pro(lb); // can assign the same or subclass object not the super class or any other class
    }
}
// K.java:7: error: method pro in class K cannot be applied to given types;
//         pro(lb);
//         ^
//   required: Animal[]
//   found:    LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error
