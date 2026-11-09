class multiCatch{
    public static void main(String [] args){
        try{
            int a = 10,b = 0,c;
            c = a/b;
            System.out.println(c);

            int arr[] = {10,20,30};
            System.out.println(arr[0]);
            String str = "Ankit";
            System.out.println(str.toUpperCase());

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ARRAY EXCEPTION");
        
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception ");

        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");

        }catch(Exception x){
            System.out.println("All type of Exception handled");
        }
    }
    // Exception x = new NullPointerException();
}