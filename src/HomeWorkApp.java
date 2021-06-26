public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumNumbers(9, 8));
        isPositiveNumbers(-5);
        System.out.println(isNegativeInteger(-10));
        stringInteger(5, "Привет");
        System.out.println(leapYear(2000));

    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 10;
        int b = 20;
        if(a+b>0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 97;

        if (value<=0){
            System.out.println("Красный");
        }
        else if (value>0||value<=100){
            System.out.println("Желтый");
        }
        else if (value>100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 35;
        int b = 29;
        if(a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }

    public static boolean sumNumbers(int a, int b){
        return a+b>=10 && a+b<=20;
    }

    public static void isPositiveNumbers(int a){
        if(a>=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegativeInteger(int a){
        return a<0;
    }

    public static void stringInteger(int a, String s) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean leapYear(int a){
        if (a % 400 == 0) {
            return true;
        }
        if (a % 100 == 0) {
            return false;
        }
        return a % 4 == 0;
    }
}
