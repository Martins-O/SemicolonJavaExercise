package printstream;


import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Print {
    public static void main(String[] args) {
        try {
            var printStream = new PrintStream("martins@martins-Latitude-E7270:~/Desktop$");
            printStream.println("Desktop");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
    }
}