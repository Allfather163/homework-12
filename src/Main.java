public class Main {
    public static void main(String[] args) {
        recomendVersoin(2019,0);
        checkDeliveryTime(2);
        checkYearLeap(2020);
        int deliveryTime = checkDeliveryTime(90);
        System.out.println("Доставка займет " +deliveryTime+" дня");
    }


    public static void checkYearLeap(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(" " + year + " год не является високосным");
        } else {
            System.out.println(" " + year + " год является високосным");
        }
    }
    public static void recomendVersoin(int clientYear,int clientOS1) {



        if (clientOS1 == 0 && clientYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientYear > 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static int checkDeliveryTime(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance > 20 && distance <= 60) {
            deliveryDays = 2;
        } else if (distance > 60 && distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }


}






























