/**
*Пакет учебы или папка учеба. Сюда помещаються будут домашние работы
 */
package study;

/**
 * Созданный новый клас с внесением первого дз, коментариев что где идет и зачем. Самое сложное наверно это без
 * подсматривания на образец начать писать заново метод. Класс как ни странно я запомнил пока что быстро.
 */
public class HomeWorkEditOne {
    /*метод nubmer не чего не возвращает нам( вот тут переодически в логике восприятия затык,приходится на веру.
    Он выводит на экран правда если сумма чисел а и б попадают в диапозон от 10 до 20 включительно, если нет то лож.
    Есть подозрение что в скобки принтлн можно было подставить boolean или как то так и сам пичатал в зависимости от
    условий тру или фолс.
     */
    static void number(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /*
    Метод result принимает на вход 4 аргумента и возвращает исход выражения которое описано в return. куда возвращает?
    непонятно.
     */
    static int result(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    /*
    Метод whyNumber не совсем отображает суть его работы. Так сказать отсебятина немного приближенная к нужному.
    Где то даже встречался с тем что придумать название метода сложнее чем его написать. Ну хз.
    Смысл работы метода в том что возвращает нам значение а и выводит на печать, в зависимости от соблюдения условия,
    позитивное это число или нет, с учетом того что ноль позитивное число считается для данной задачи.
     */
    static int whyNumber(int a){
        if (a >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        return a;
    }
/*
Вот тут мне помогла идея в плане булиан после статитки. Из серии мен поменяй на булиан коль хочешь его вернуть.
каша конечно та еще метод булиан принимает на вход число. но пока котелок не вскипел.

метод negativNum,если я правильно уловил суть, принимает в себя число если оно отрицательное то возвращается тру
и в дальнейшем если переменная имеет числовое значение то применив данный метод мы уже можем завязать проверку на
булевые значения. Это размышления на тему.
 */
    static boolean negativNum(int a){
        if (a<0) {
            System.out.println("Positive");
         return true;
        } else {
            System.out.println("Negative");
            return false;
        }
    }
    /*
    Думал возьму с наскока, а не вышло. Порно началось в (стринг нейм. из-за квадратных скобок.) Долго крутился. Залез
    в гпт даже. И там ерунда вышла. но вычитал там про масив который вроде и обозначается квадратными скобками.
    так как у нас не масив а просто скобки нахер они и нужны. примерно так допер до удаления скобок квадратных. и вроде
    как заколосилось
     Метод name ( в голове уже нами) не фига нам не возвращает ю выводит на печать конструкцию привет + аргумент
      ввиде строки который передаеться в майню
     */
    static void  name(String name) {
        System.out.println("Привет, " + name);
    }
    /*
    Метод маин является запускающим методом или как говорите точкой входа и передает необходимые аргументы методам
    которые он вызывает.
     */
    public static void main(String[] args) {
        number(10, 99);
        result(10, 15, 36, 59);
        whyNumber(56);
        negativNum(7);
        name("lolo");
    }
}
