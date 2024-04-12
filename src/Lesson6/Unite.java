package Lesson6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Unite {
    public static void unite() throws IOException {
        FileOutputStream record = new FileOutputStream("fileOne.txt", true);
        FileOutputStream records = new FileOutputStream("fileTwo.txt", true);
        byte[] content = Files.readAllBytes(Paths.get("fileTwo.txt"));
        record.write(content);
        records.flush();
        records.close();
        record.flush();
        record.close();
        throw new IOException("d");
    }
}
