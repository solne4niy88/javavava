package animal;



public class Main {
    public static void main(String[] args) {
        Dogs bob = new Dogs("Bob", 0.5F, 500,0.5F,
                10);
        Cats mimi = new Cats("mimi", 2F, 200, 2F,
                500);

        System.out.println(mimi.swim(52) ? "Научились кошки плавать" : "Не умеют кошки плавать");
        System.out.println(mimi.jump(1) ? "Кошечка совершила прыжок" : "Введите другое число");
        System.out.println(mimi.run(100) ? "Кошечка совершила забег" : "Введите другое число");
        System.out.println(mimi.jumpOverObstacles(8) ? "Кошка прыгнула в высоту"
                : "Введите другое число");

        System.out.println(bob.swim(5) ? "Пёсик устроил заплыв" : "ведите другое число");
        System.out.println(bob.jump(1) ? "Собачка совершила прыжок" : "Введите другое число");
        System.out.println(bob.run(400) ? "Собачка совершила забег" : "Введите другое число");
        System.out.println(bob.jumpOverObstacles(5) ? "Собачка прыгнула в высоту"
                : "Введите другое число");
    }
}
