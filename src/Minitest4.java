import java.util.Scanner;

public class Minitest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String name = input.nextLine();

        System.out.println("Nhap tuoi:");
        int age = input.nextInt();

        System.out.println("Nhap ten lop:");
        String className = input.nextLine();

        Student student = new Student(name, age, className);

        System.out.println("Thong tin hoc sinh: ");
        System.out.println("Ten: " + student.getName());
        System.out.println("Tuoi: " + student.getAge());
        System.out.println("Lop: " + student.getClassName());
    }
}

class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}