public class Main {

    //заданий 1

    public static void main(String[] args) {

        // ЗАДАНИЕ 1
        int year = 2024;
        printYear(year);

        //ЗАДАНИЕ 2
        int clientDeviceYear = 2016;
        int clientOS = 0; // IOS 0 | Android 1
        printSystem(clientDeviceYear, clientOS);

        // ЗАДАНИЕ 3

        int deliveryDistance = 95;
        printDelivery(deliveryDistance);

    }

    // метод для задания 1
    public static void printYear(int year) {
        if (year < 1584) {
            System.out.println(year + " Отсчёт от 1584 года");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год високосный");
        } else {
            System.out.println(year + " Год не високосный");
        }

    }

    // метод для задания 2
    public static void printSystem(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    // метод для задания 3
    public static void printDelivery(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("На доcтавку потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("На доставку потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("На доставку потребуется 3 дня");
        } else {
            System.out.println("Нет доставки");
        }

    }




}