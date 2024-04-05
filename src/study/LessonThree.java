package study;
/* array[i] ^= 1
1.Полностью разобраться с кодом. Попробовать переписать с нуля, стараясь не подглядывать в методичку.
2. Переделать проверку победы, что бы она была реалищована просто набором условий., напрмиер с использованием циклов
3. Попробовать перписать логику проверки, что бы она работала на поля 5х5 и количества фишек 4.  Очень желательно не
делать просто набором условий из всех возможных ситуаций.
4. Доработать ИИ, что бы он мог блокировать ходы игрока.( ксловия с оператором на тему если два совпали у игрока  -
попробовать реализовать.)
 */
import java.util.Random;
import java.util.Scanner;

public class LessonThree {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPETY_DOT = '*';

    static Scanner scaner = new Scanner(System.in);
    static final Random rand = new Random();

    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++)// всегда по столбцу.
            for (int j = 0; j < SIZE_X; j++)// всегда по строке

                field[i][j] = EMPETY_DOT;
    }

    private static void printField() {
        System.out.println("------ ");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++)
                System.out.print(field[i][j] + "|");
            System.out.print("\n");
        }
        System.out.print("______");
    }

    private static void setXO(int y, int x, char symbol) {

        field[y][x] = symbol;
    }

    private static void playerTurn() {
        int x;
        int y;
        do {
            System.out.println("ВВедите координаты X-Y (1 - 3):");
            x = scaner.nextInt() - 1;
            y = scaner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setXO(y, x, PLAYER_DOT);
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) return false;
        return (field[y][x] == EMPETY_DOT);
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setXO(y, x, AI_DOT);
    }

    private static boolean chekWin(char sym) {
        if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym) return true;
        if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym) return true;
        if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym) return true;

        if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym) return true;
        if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym) return true;
        if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym) return true;

        if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym) return true;
        if (field[2][0] == sym && field[1][1] == sym && field[0][2] == sym) return true;
        return false;
    }

    private static boolean fieldFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPETY_DOT) return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerTurn();
            printField();
            if (chekWin(PLAYER_DOT)) {
                System.out.println("player Wins! congratilation!");
                break;
            }
            if (fieldFull()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printField();
            if (chekWin(AI_DOT)) {
                System.out.println("ai Wins! sorry!");
                break;
            }
            if (fieldFull()) {
                System.out.println("Draw");
                break;
            }
        }

    }
}

