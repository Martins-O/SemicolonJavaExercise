package exceotion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("SemicolonJavaCodes/src/exceotion/File");
            br = new BufferedReader(reader);
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } finally {
            if (reader != null) {
                reader.close();
                System.out.println("closing reader...");
            }
            if (br != null) {
                br.close();
            }
        }

    }

}
