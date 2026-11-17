// -----------Create a file in Java-----------

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("abc.txt");

        if (f.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
}