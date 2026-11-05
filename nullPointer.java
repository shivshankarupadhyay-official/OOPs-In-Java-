//----------- Null Pointer Exceptions-----------

// class NPE{
//     public static void main(String[] args){
//         String str = null;
        
//         System.out.println(str.toUpperCase());//This will throw a NullPointerException Because we are trying to call a method on a null object reference.

//     }
// }



class NPE{
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.toUpperCase());

        }catch(NullPointerException n){
            System.out.println("Null cants be casted");
        }

    }
}