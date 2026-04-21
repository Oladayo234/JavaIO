import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFromFile {


    public static String readDataFromFile(Path filePath) {
        String file = null;
        try {
            file = Files.readString(filePath);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return file;
    }

    public static void deleteFile(Path filePath) {
        try {
            Files.deleteIfExists(filePath);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static String updateFile(Path filePath, String data){
        String file = readDataFromFile(filePath) + " " + data ;
        FileDataWriter.writeDataToFile(file, filePath);
        return readDataFromFile(filePath);
    }


}
