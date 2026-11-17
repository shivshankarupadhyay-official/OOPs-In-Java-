import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");

        fw.write("Hello Java");
        fw.close();

        System.out.println("Data written successfully");
    }
}