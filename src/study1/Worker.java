package study1;

public class Worker {
    String FIO;
    int age;
    String jobTitle;
    String email;
    String salary;
    String phone;

//    void printWorker(){
//        System.out.println();
//    }

    public Worker(String f, int a, String j, String e, String s, String p) {
        this.FIO = f;
        this.age = a;
        this.jobTitle = j;
        this.email = e;
        this.salary = s;
        this.phone = p;
    }

    void printInfo() {
        System.out.println("-----------------------------");
        System.out.println(" ФИО - " + FIO + "\n Возраст - " + age + "\n Должность - " + jobTitle + "\n Электронная почта -"
                + email + "\n Зарплата - " + salary + "\n Телефон - " + phone);
        System.out.println("-----------------------------");
    }
    int getAge() {
        return age;
    }
    String getFIO() {
        return FIO;
    }
    String getJobTitle() {
        return jobTitle;
    }
    String getEMail() {
        return email;
    }
    String getSalary() {
        return salary;
    }
    String getPhone() {
        return phone;
    }
}
---------------------------------------------------------------
        package study1;




public class Examination {
    public static void main(String[] arg) {
        Worker employee1 = new Worker("Петров Олег Виталийевич", 20, "manager", "lol@lol.com",
                "80000", "897755622");
        Worker employee2 = new Worker("Иванов Иван Иваныч", 40, "manaegr", "lol@lol1.com",
                "120000", "89663336655");
        Worker employee3 = new Worker("Сидоров Сидор Сидорович", 60, "manaegr", "lol@lol2.com",
                "15000", "89556665544");
        Worker employee4 = new Worker("Бамблей бумбей Хотабыч", 18, "manaegr", "lol@lol3.com",
                "200000", "89445556622");
        Worker employee5 = new Worker("Лисан Бузкей Славович", 16, "manaegr", "lol@lol4.com",
                "500000", "89223336666");
        Worker[] employees = new Worker[]{employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40) {
                System.out.println("-----------------------------");
                System.out.println("ФИО - " + employees[i].getFIO()
                        + "\nВозраст - " + employees[i].getAge()
                        + "\nДолжность  - " + employees[i].getJobTitle()
                        + "\n Электронная почта" + employees[i].getEMail()
                        + "\nЗарплата - " + employees[i].getSalary()
                        + "\nТелефон" + employees[i].getPhone());
                System.out.println("-----------------------------");
            }
        }

    }
}
