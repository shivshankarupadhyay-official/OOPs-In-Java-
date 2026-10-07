// ___________INSTANCE BLOCKS__________

// class In{
//     int a,b;
//     In()
//     {
//         a = 30; b = 40;
//         System.out.println(a+" "+b);

//     }
//     {
//         a =10;
//         b = 20;

//         System.out.println(a+" "+b);

//     }
// }
// class B{
//     public static void main(String[] args){
//         In ref = new In();

//     }
// }



class Student {

    // Instance Block
    {
        System.out.println("Instance Block");
    }

    // Constructor
    Student() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}