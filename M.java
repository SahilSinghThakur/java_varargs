class M{
    static void studentInfo(Student... stu){
        for(Student s : stu){
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println(s.sname);
        }
        System.out.println("===================");
    }
    public static void main(String[] args) {
        studentInfo(new Student("Rahul",12,"Tanya Convent Higher Secondary School Patan"),new Student("Pankaj", 20,"Aditya Convent Higher Secondary School Patan"));
        studentInfo(new Student("Gajendra",22,"Tanya convent higher secondary school"));
    }
}