import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Activites3_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IdeaProjects\\LearnServerSocket\\ACtivites101.txt");
        Path path = Paths.get("D:\\IdeaProjects\\LearnServerSocket\\ACtivites101.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        long lines = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
                paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                String sentence[] = line.split("[!?.:]+");
                lines = Files.lines(path).count();
            }
        }
        if (lines >= 1) {
            paraCount++;
        }

        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of lines = "+ lines);
        System.out.println("Total number of characters = "+ characterCount);
    }
}
