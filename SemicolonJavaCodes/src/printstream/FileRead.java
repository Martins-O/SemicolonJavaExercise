package printstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader =
                new BufferedReader(new FileReader("/home/martins/Java Projects/IdeaProjects/SemicolonJavaCodes/src/output.txt"))){
            System.out.println(bufferedReader.readLine());
        }catch (IOException exception){
            System.err.println("Exception msg: "+exception.getMessage());
        }

    }
}
