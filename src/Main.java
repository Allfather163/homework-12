public class Main {
    public static void main(String[] args) {
        checkCurrentYear(2019);
        checkDeliveryTime(1);
        checkYearLeap(2020);
    }


    public static void checkYearLeap(int year) {
        System.out.println("задание 1");

        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(" " + year + " год не является високосным");
        } else
            System.out.println(" " + year + " год является високосным");

    }


    public static void checkCurrentYear(int i) {


        boolean client = true;
        boolean clientOS1 = true;
        boolean clientAndroid1 = true;
        if (client && i <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 && i > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientAndroid1 && i > 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        public static void checkDeliveryTime ( int d){
            int deliveryDistance = 50;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней " + d);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней " + d);

            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней " + d);
            } else {
                System.out.println("доставки нет");
            }


        }
    }
}















