class Student extends School{
    String name;
    int age;

    Student(String name,int age,String sname){
        super(sname);
        this.name = name;
        this.age = age;
    }
}