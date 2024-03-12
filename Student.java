public class Student {
    String name;
    String usn;
    String dept;
    String sem;
    String program;

    public Student(String name, String usn, String dept, String sem, String program) {
        this.name = name;
        this.usn = usn;
        this.dept = dept;
        this.sem = sem;
        this.program = program;
    }

    void get_name() {
        System.out.println("Name: " + name);
    }

    void get_usn() {
        System.out.println("USN: " + usn);
    }

    void get_dept() {
        System.out.println("Department: " + dept);
    }

    void get_sem() {
        System.out.println("Semester: " + sem);
    }

    void get_program() {
        System.out.println("Program: " + program);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Hazra", "01fe22bca070", "BCA", "4th", "Bachelor of Computer Application");

        s1.get_name();
        s1.get_usn();
        s1.get_dept();
        s1.get_sem();
        s1.get_program();
    }
}

class Course {
    String[] courses = {"Machine_learning", "Software_testing", "C_Sharp", "DevOps"};
    float[] marks = {88, 35, 38, 66};

    void get_courses() {
        System.out.println("Courses Registered : ");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("\t" + courses[i]);
        }
    }

    void get_marks() {
        for (int i = 0; i < courses.length; i++) {
            if (marks[i] < 40) {
                System.out.println(courses[i] + " = " + marks[i]);
            }
        }
    }
}
