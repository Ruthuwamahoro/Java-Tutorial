
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOLogics {
    public static void main (String[] args){
        try {
            
            // write to file
            BufferedWriter bw = new BufferedWriter(
            new FileWriter(
                // we are going to say path where we want our file to go, if it is not there it creates it for us

                "C:\\Users\\User\\Desktop\\Java\\FileIO\\test.txt"));
            bw.write("Karen\n");
            bw.write("chad\n");
            bw.write("becky\n");
            bw.close();

            // read from file

            BufferedReader br = new BufferedReader(
                new FileReader(
                    "C:\\Users\\User\\Desktop\\Java\\FileIO\\test.txt"));
            String line;
            // while((line = br.readLine()) != null) {
            //     System.out.println(line);
            // }
            // br.close();

            



            // copy file
            BufferedWriter bw2 = new BufferedWriter(
                new FileWriter(
                    "C:\\Users\\User\\Desktop\\Java\\FileIO\\test-copy.txt"));

            while((line = br.readLine()) != null) {
                bw2.write(line + "\n");
            }
            bw2.close();

        } catch (Exception e) {
            return;
            // TODO: handle exception
        }
        
    }
}
