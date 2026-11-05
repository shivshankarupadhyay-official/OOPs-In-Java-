class NFE{
    public static void main(String[] args) {

        String str = "ankit";

        try{
            int a = Integer.parseInt(str);
            System.out.println(a);

            System.out.println("String NumberFormateException" );

        }
        catch(NumberFormatException n){
            System.out.println("String "+ str +" javacan't be converted to Integer");
        }
    }
}