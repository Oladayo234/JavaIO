import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class FileDataWriterTest {

    @Test
    public void testCanWriteTextToFile() {
        try{
            String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output/numbers.txt";
            Path path = Paths.get(fileLocation);
            String text = "10,100,1000,10000";
            FileDataWriter.writeDataToFile(text,path);
            String dataReadFromFile = Files.readString(path);
            assertEquals(text, dataReadFromFile);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void readDataFromFile(){
        String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output";
        Path path = Paths.get(fileLocation, "numbers.txt");
        String readFile = ReadFromFile.readDataFromFile(path);
        assertEquals("10,100,1000,10000", readFile);
    }

    @Test
    public void deleteFromFile(){
        String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output/numbers.txt";
        Path path = Paths.get(fileLocation);
        ReadFromFile.deleteFile(path);
        assertFalse(Files.exists(path));
    }

    @Test
    public void deleteDirectory(){
        String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output/folderOne/folderTwo";
        Path path = Paths.get(fileLocation);
        Path path2 = Path.of(fileLocation, "folderOne", "folderTwo");
        ReadFromFile.deleteFile(path);
        assertFalse(Files.exists(path));
    }

    @Test
    public void updateDataToFile(){
        String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output/numbers.txt";
        Path path = Paths.get(fileLocation);
        String readFile = ReadFromFile.updateFile(path, "He is a Boy");
        assertEquals("10,100,1000,10000 He is a Boy", readFile);
    }

}

