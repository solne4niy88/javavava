package Lesson6;


import java.io.IOException;

import static Lesson6.CreatTXT.recFileOne;
import static Lesson6.CreatTwo.recFileTwo;
import static Lesson6.Search.search;
import static Lesson6.Unite.unite;

public class Main {
    public static void main(String[] args) {
        try {
            recFileOne();
//            recFileTwo();
//            unite();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            recFileTwo();
        } catch (Exception e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
        try {
            unite();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Искомое слово встретилось " + search() + " раз.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
