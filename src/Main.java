public class Main {

    public static void main(String[] args) {

        versionApp(2022, 0);
        versionApp(2023, 1);

        checkIsLeapYear(1569);
        checkIsLeapYear(1570);
        checkIsLeapYear(1571);
        checkIsLeapYear(1572);

        deliveryBankCard(10);
        deliveryBankCard(45);
        deliveryBankCard(88);
        deliveryBankCard(150);
    }


    public static void checkIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }


    public static void versionApp(int clientDeviceYear, int clientOS) {


        if (clientOS == 0 && clientDeviceYear != 2023) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear == 2023) {
                System.out.println("Установите обычную версию приложения для iOS  по ссылке");
            }
            if (clientOS == 1 && clientDeviceYear != 2023) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
            } else {
                if (clientOS == 1 && clientDeviceYear == 2023) {
                    System.out.println("Установите обычную версию приложения для Android  по ссылке");
                }
            }
        }
    }


    public static void deliveryBankCard(int Distance) {
        if (Distance < 20) {
            System.out.println("Потребуются сутки для доставки");
        } else {
            if (Distance > 21 && Distance < 60) {
                System.out.println("Потребуется двое суток для доставки");
            } else {
                if (Distance > 61 && Distance < 100) {
                    System.out.println("Потребуется трое суток для доставки");
                } else {
                    System.out.println("Досавки нет");
                }
            }
        }

    }
}

