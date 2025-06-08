package dhanu;
class Student {
    String name;
    int grade;

    Student(String n, int g) {
        name = n;
        grade = g;
    }
}

public class SimpleStudent {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Aari", 8),
            new Student("Balu", 17),
            new Student("chandu", 19),
            new Student("Daddy", 16),
            new Student("Evanla", 15)
        };

        System.out.println("Students with grade > 80:");
        for (Student s : students) {
            if (s.grade > 80) {
                System.out.println(s.name);
            }
        }
    }
}
