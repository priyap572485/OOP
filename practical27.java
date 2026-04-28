import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("101 Priya 85\n");
            fw.write("102 Rahul 90\n");
            fw.write("103 Neha 78\n");
            System.out.println("Student records written successfully.\n");
            fw.close(); 
            br = new BufferedReader(new FileReader("students.txt"));
            String line;
            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
            System.out.println("\nFile operation completed.");
        }
    }
}