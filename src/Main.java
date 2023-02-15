public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("Если " + temperature + " градусов, на улице холодно, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("Если " + temperature + " градусов, на улице сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км. в час, то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км. в час, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int age1 = 65;
        if (age1 >= 2 && age1 <= 7) {
            System.out.println("Если человеку " + age1 + " лет, то ему нужно идти в детский сад");
        } else {
            System.out.println("Если человеку " + age1 + " лет, то ему не нужно идти в детский сад");
        }
        int age2 = 15;
        if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если человеку " + age2 + " лет, то ему нужно идти в школу");
        } else {
            System.out.println("Если человеку " + age2 + " лет, то ему не нужно идти в школу");
        }
        int age3 = 19;
        if (age3 > 18 && age3 < 24) {
            System.out.println("Если человеку " + age3 + " лет, то ему нужно идти в универ");
        } else {
            System.out.println("Если человеку " + age3 + " лет, то ему не нужно идти в универ");
        }
        int age4 = 18;
        if (age4 >= 24) {
            System.out.println("Если человеку " + age4 + " лет, то ему нужно идти на работу");
        } else {
            System.out.println("Если человеку " + age4 + " лет, то ему не нужно идти на работу");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int age1 = 6;
        if (age1 <= 5) {
            System.out.println("Если ребёнку " + age1 + " лет, то ему нельзя кататься на аттракционе");
        } else {
            System.out.println("Если ребёнку " + age1 + " лет, то ему можно кататься на атракционе,");
        }
        if (age1 > 5 && age1 < 14) {
            System.out.println(" но с сопровождением взрослых");
        }
        if (age1 >= 14) {
            System.out.println(" без сопровождения взрослых");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int allPlaces = 102;
        int sittingPlaces = 60;
        int passengers1 = 100;
        if (passengers1 <= allPlaces) {
            System.out.println("В вагоне есть места");
        } else {
            System.out.println("Мест в вагоне нет");

        }
        if (passengers1 <= 60) {
            System.out.println("Есть сидячие места");
        }
        if (passengers1 > 60 && passengers1 <= 102) {
            System.out.println("Остались только стоячие места");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int one = 545454;
        int two = 5995;
        int three = 10000;
        if (one > two){ if(one > three)
                System.out.println(one + " самое больше число");
            else System.out.println(three + " самое больше число");
        }else{
            if (two>three)
                System.out.println(two + " самое большое число");
            else System.out.println(three + " самое большое число");
           }
        }
    }
