import java.io.*;
import java.util.Scanner;

public class Compiler {
    public static void main(String[] args) {

        //Declare Variables
        File file = new File("/Users/Daniel/IdeaProjects/Intuitive Coding/src/Source_Code");
        int lineNumber = 0;
        String[] in = null;

        //Count the number of lines - works
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String temp;

            while ((temp = br.readLine()) != null) {
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Divide the File up - works
        try {
            Scanner input = new Scanner(file);
            in = new String[lineNumber];
            for (int i = 0; i < lineNumber; i++) {
                in[i] = input.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Analyse each sentence
        for (int i = 0; i < in.length; i++) {
            String line = in[i];

        }
    }
}
