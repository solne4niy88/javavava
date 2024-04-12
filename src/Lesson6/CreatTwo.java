package Lesson6;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreatTwo {
    static int SIZE = 55;
    public static void recFileTwo() throws IOException {
        FileOutputStream fileTwo = new FileOutputStream("fileTwo.txt", true);
        for(int i = 0; i < SIZE; i++ ) {
            fileTwo.write("И последует продолжение дела сего.\n".getBytes()); }
        fileTwo.flush();
        fileTwo.close();
        throw new IOException("t");
    }
}
