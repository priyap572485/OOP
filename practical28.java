import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                String words[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
                charCount += line.replace(" ", "").length();
            }

            System.out.println("Total number of lines: " + lineCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Total number of characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Input Output Error: " + e.getMessage());

        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}