package Lesson6;

import java.io.FileOutputStream;
import java.io.IOException;


public class CreatTXT {
    static int SIZE = 55;
    public static void recFileOne() throws IOException {
        FileOutputStream fileOne = new FileOutputStream("fileOne.txt", true);
        for(int i = 0; i < SIZE; i++ ) {
        fileOne.write("Да повториться данное слово 50 и более раз.\n".getBytes()); }
        fileOne.flush();
        fileOne.close();
        throw new IOException("d");
    }
//    public static void recFileTwo() throws IOException {
//        FileOutputStream fileTwo = new FileOutputStream("fileTwo.txt", true);
//        for(int i = 0; i < SIZE; i++ ) {
//            fileTwo.write("И последует продолжение дела сего. ".getBytes()); }
//        fileTwo.flush();
//        fileTwo.close();
//        throw new IOException("t");
//    }
}
