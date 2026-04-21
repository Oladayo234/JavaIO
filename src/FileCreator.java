import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreator {
    static void main(String[] args) {
        try {
            String directory = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output";

            //step one
            Path path = Path.of(directory, "numbers.txt");
            Path path2 = Path.of(directory, "folderOne", "folderTwo");

            Path path3 = Path.of(directory, "numbers.txt");
            System.out.println("filePath::" + path3);

            //step 2
            //Files.createDirectories(path2);
            Files.createFile(path3);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }




    }
}
