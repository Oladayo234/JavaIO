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
        try{
            String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output";
            Path path = Paths.get(fileLocation, "numbers.txt");
            Files.writeString(path, "10,100,1000,10000");
            String readFile = ReadFromFile.readDataFromFile(path);
            assertEquals("10,100,1000,10000", readFile);
        }catch(IOException ex){
            ex.printStackTrace();
        }
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
        try {
            String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output/folderOne/folderTwo";
            Path path = Paths.get(fileLocation);
            Files.createDirectories(path);
            assertTrue(Files.exists(path));
            ReadFromFile.deleteFile(path);
            assertFalse(Files.exists(path));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @Test
    public void updateDataToFile(){
        try{
            String fileLocation = "/home/semi/Documents/Semicolon/Phase_Two/Intelij Projects/JavaIO/src/output/numbers.txt";
            Path path = Paths.get(fileLocation);
            String contentBefore = Files.readString(path);
            String updatedContent = ReadFromFile.updateFile(path, "He is a Boy");
            assertEquals(contentBefore + " He is a Boy", updatedContent);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}

