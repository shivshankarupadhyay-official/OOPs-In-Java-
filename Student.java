class Student {

    String name;
    int age;
    int marks;

    // Constructor 1 - No parameter
    Student() {
        name = "Unknown";
        age = 0;
        marks = 0;
    }

    // Constructor 2 - Two parameters
    Student(String n, int a) {
        name = n;
        age = a;
        marks = 0;
    }

    // Constructor 3 - Three parameters
    Student(String n, int a, int m) {
        name = n;
        age = a;
        marks = m;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Rahul", 20);
        Student s3 = new Student("Aman", 21, 85);

        s1.display();
        s2.display();
        s3.display();
    }
}