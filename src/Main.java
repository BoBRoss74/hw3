public class Main {
    public static void main(String[] args) {

        //Задание 1
        int clietnOsIos = 0;
        int clienOsAndroid = 1;

        System.out.println("Вы используете Ios ли Android?");

        if (clietnOsIos == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clienOsAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


                // Задание 2

        int ClietnOsIos = 0;
        int ClietnOsAndroid = 1;
        int ClietnDeviceYear = 2016;

        if (ClietnOsIos == 0 && ClietnDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");
        } else if (ClietnOsAndroid == 1 && ClietnDeviceYear > 2015) {
            System.out.println("Установите актуальную версию приложения для Ios по ссылке");
        }

        if (ClietnOsAndroid == 1 && ClietnDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (ClietnOsAndroid == 1 && ClietnDeviceYear > 2015) {
            System.out.println("Установите актуальную версию приложения для Android по ссылке");

        }
                //Задание 3
        int year = 2024;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear)
        {
            System.out.println(year + " Високосный год");
        } else
            System.out.println(year + " Не високосный год");


                //Задание 4

        int deliveryDistance = 20;

        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else { System.out.println("Потребуется дней: 1" );}
        if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("Доставка займет двое суток");
        }
        if (deliveryDistance >= 61 && deliveryDistance <= 100){
            System.out.println("Доставка займет трое суток");
        }

                // Задание 5

        int monthNumber = 14;

        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
        }
    }





