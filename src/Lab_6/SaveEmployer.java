package Lab_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static Lab_6.Main.masEmployer;

public class SaveEmployer {

    public static void createFileWithEmployers() {
        try (FileWriter logWriter = new FileWriter("employers.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(logWriter)) {
            for (Employer e : masEmployer) {
                String s = e.toTextFile() + "\n";
                bufferedWriter.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
