package Lesson6;

import java.io.*;

public class Search {
    public static int search () throws IOException {
        String word = "И";
        String line;
        int quanity = 0;

        BufferedReader read = new BufferedReader(new FileReader("fileOne.txt"));

        while((line = read.readLine()) != null) {
            if(line.contains(word)) {
                quanity += 1;
            }
        }
        return quanity;
    }
}
