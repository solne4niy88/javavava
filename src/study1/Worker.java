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

        public WorkerCom(String f, int a, String j, String e, String s, String p) {
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
            study1.WorkerCom employee1 = new study1.WorkerCom("Петров Олег Виталийевич", 20, "manager", "lol@lol.com",
                    "80000", "897755622");
            study1.WorkerCom employee2 = new study1.WorkerCom("Иванов Иван Иваныч", 40, "manaegr", "lol@lol1.com",
                    "120000", "89663336655");
            study1.WorkerCom employee3 = new study1.WorkerCom("Сидоров Сидор Сидорович", 60, "manaegr", "lol@lol2.com",
                    "15000", "89556665544");
            study1.WorkerCom employee4 = new study1.WorkerCom("Бамблей бумбей Хотабыч", 18, "manaegr", "lol@lol3.com",
                    "200000", "89445556622");
            study1.WorkerCom employee5 = new study1.WorkerCom("Лисан Бузкей Славович", 16, "manaegr", "lol@lol4.com",
                    "500000", "89223336666");
            study1.WorkerCom[] employees = new study1.WorkerCom[]{employee1, employee2, employee3, employee4, employee5};

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

}
