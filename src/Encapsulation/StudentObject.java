package Encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student=new Student();
        student.setName("Suleyman");
        System.out.println("student.getName() = " + student.getName());
      student.setAge(24);
        System.out.println("student.getAge() = " + student.getAge());
    }
}
