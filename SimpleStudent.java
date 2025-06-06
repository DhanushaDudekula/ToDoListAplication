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
            new Student("Alice", 85),
            new Student("Bob", 75),
            new Student("Charlie", 90),
            new Student("David", 65),
            new Student("Eva", 95)
        };

        System.out.println("Students with grade > 80:");
        for (Student s : students) {
            if (s.grade > 80) {
                System.out.println(s.name);
            }
        }
    }
}
