import java.io.*;

class Main {
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("abc.txt");
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}