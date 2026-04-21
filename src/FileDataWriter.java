import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataWriter {


    public static void writeDataToFile(String text, Path filePath) {

        try {
            Files.write(filePath,text.getBytes());
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
