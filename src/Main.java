public class Main {
    public static void main(String[] args) {
        recomendVersoin(2019);
        checkDeliveryTime(2);
        checkYearLeap(2020);
    }


    public static void checkYearLeap(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(" " + year + " год не является високосным");
        } else {
            System.out.println(" " + year + " год является високосным");
        }
    }
    public static void recomendVersoin(int clientYear) {
        int clientOS1 = 0;


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
        int deliveryDays = 1;
        int deliveryDistance = 50;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + distance);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + distance);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + distance);
        } else {
            System.out.println("доставки нет");
            System.out.println("Доставка займет: " + checkDeliveryTime(1) + " дней");
        }
        return deliveryDays;
    }
}






























