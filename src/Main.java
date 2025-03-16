public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // task 1
        System.out.println("task 1");

        int os = 0;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не верное значение ");
        }
        // task 2
        System.out.println("task 2");

        os = 0;
        int clientDeviceYear = 2015;
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        // task 3
        System.out.println("task 3");

        int yeat = 2021;
        if (yeat > 1584 && (((yeat % 4 == 0 && yeat % 100 != 0) || yeat % 400 == 0))) {
            System.out.println(yeat + " Год щитаеться выскокостныйм");
        } else {
            System.out.println(yeat + " Год щитаеться не высокогокостным");
        }
        // task 4
        System.out.println("task 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("потребуеться дней " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуеться дней " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуеться дней " + 3);
        } else {
            System.out.println("доставки нету");
        }
        // task 5
        System.out.println("task 5");
         int monthNumber = 12;
         switch (monthNumber) {
             case 12:
             case 1:
             case 2:
                 System.out.println("Зима");
                 break;
             case 3:
             case 4:
             case 5 :
                 System.out.println("Весна");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Лето");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Осень");
                 break;
             default:
                 System.out.println("НЕ верный номер месяца");
         }
    }
}