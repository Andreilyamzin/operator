public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + " лет, " +
                    "то он несовершеннолетний,нужно еще подождать ");
        }
        //Задача 2
        int t = 4;
        if (t < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //Задача 3
        int v = 60;
        if (v < 70) {
            System.out.println("Скорость превышена ");
        } else {
            System.out.println("Скорость не превышена");
        }
        //Задача 4
        int ageChel = 30;
        if (ageChel >= 2 && ageChel <= 6) {
            System.out.println("Если возраст ребенка равен " + ageChel + " Ему нужно ходить в детский сад");
        } else if (ageChel >= 7 && ageChel <= 17) {
            System.out.println("Если возраст человека равен " + ageChel + " То ему нужно ходить в школу");
        } else if (ageChel >= 18 && ageChel <= 24) {
            System.out.println("Если возраст человека равен " + ageChel + " то его место в университете");
        } else if (ageChel > 24) {
            System.out.println("Если возраст человека равен " + ageChel + " то пора бы пойти на работу");
        } else {
            System.out.println("Если ребенку " + ageChel + " то он еще слишком мал");
        }
        //Задача 5
        int child = 14;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child +
                    " то ему нельзя кататься на атракционе");}
        else if (child >= 5 && child <= 14) {
            System.out.println("Если возраст ребенка равен " + child +
                    " то он может кататься только в сопровождении взрослого");}
        else {
        System.out.println("Если возраст ребенка равен " + child +
                " то он может кататься самостоятельно");}
        //Задача 6
        int people = 10;
        int seatingPlaces = 60;
        int ollPlaces= 102;
        int seated= ollPlaces- seatingPlaces;
        System.out.println(seated+ " стоячих мест");
        if (people <= seatingPlaces ) {
            System.out.println("Если в вагоне "+ people+ " людей, то в вагоне есть сидячие места" );}
        else if (people > seatingPlaces && people <ollPlaces){
            System.out.println("Если в вагоне " +people + " человек, " +
                    "то в вагоне остались только стоячие места");}
        else {
            System.out.println("Если в вагоне "+ people +" человек, то в вагоне нет мест");}
        //Задача 7
        int one= 9;
        int two= -8;
        int three= 10;
        if (one> two && one > three){
            System.out.println(one+ " наибольшее число");}
        else if (two> one && two> three ) {
            System.out.println(two+ " наибольшее число");}
        else {
            System.out.println(three+ " наибольшее число");}




    }
}
