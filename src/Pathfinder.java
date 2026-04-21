import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pathfinder {
    static void main(String[] args) {
        String fileLocation = "a/b/c/../e/f";//a => root directory c => file
        Path path = Paths.get(fileLocation);
        path = path.normalize();
//        Path path1 = Path.of(fileLocation);
        System.out.println(path);


//        System.out.println(path.getFileSystem());
//        System.out.println(path.getFileName());
/*
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 6, 7, 8, 9);
        int frequency = Collections.frequency(numbers, 4);
        System.out.println(frequency);


        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());*/

    }
}
