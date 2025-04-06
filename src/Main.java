public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // task 1
        System.out.println("task 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age  + " , то он совершено летний");
        } else
            System.out.println("Если возраст человека равен " + age  + " , то он не достиг совершеннолетия, нужно немного подождать");
        // task 2
        System.out.println("task 2");
        int outdoorTemperature = 5;
        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку");
        }else
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки");
        // task 3
        System.out.println("task 3");
        int vehicleSpeed =120;
        if (vehicleSpeed > 60) {
            System.out.println("Если скорость " + vehicleSpeed + " то, придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + vehicleSpeed + "можно ездить спокойно");
        }
        // task 4
        System.out.println("tack 4");
        int ahe = 19;
        if (ahe >= 2 && ahe < 6) {
            System.out.println("Ему надо ходить в детский сад");
        }else if (ahe >= 7 && ahe < 17) {
            System.out.println("Ему нужно ходить в школу");
        }else if (ahe >= 18 && ahe < 21) {
            System.out.println("Ему нужно ходить в универеситет");
        }else if (ahe >24){
            System.out.println("Ему нужно ходить на работу");
        }
        // task 5
        System.out.println("task 5");
        int little = 7;
        if (little <= 5) {
            System.out.println("Он не может кататься на отракционах");
        }else if (little >= 5 && little < 14) {
            System.out.println("Он может кататься только в соопражениие взрослого");
        }else if (little >= 14) {
            System.out.println("Он может кататься без соопровождения");
        }
        // task 6
        System.out.println("task 6");
        int places = 102;
        int sitPlaces = 60;
        int people = 110;
        if (people < sitPlaces) {
            System.out.println("В вагоне есть седяще места");
        }
        if (people >= sitPlaces && people < places) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= places){
            System.out.println("В вагоне нет мест");
        }
        // task 7
        System.out.println("task 7");
        int one =10;
        int two = 5;
        int theer = 30;
        if (one >= two && one >= theer) {
            System.out.println("Максимальное число в переменой one, равно "+ one);
        }else if (two >= theer) {
        System.out.println(" Максимальное число в переменой two, равно "+ two);
        }else {
            System.out.println("Максимальное число в переменой theer, равно "+ theer);
        }

    }
}