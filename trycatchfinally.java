// ------------Try - Catch - Finally-----------

class Handling{
    public static void main(String args[]){
        try{
            System.out.println("Inside try block");
            int a = 10,b=2,c;
            c = a/b;
            System.out.println(c);
            System.out.println("like share");

        }
        catch(ArithmeticException a){
            System.out.println("CANT DIVIDE BY ZERO");

        }
        finally{
            System.out.println("Finally block executed");
        }
        System.out.println("main method ended");
    }
}