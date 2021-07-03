import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args){

        //Задание 1.
        homeWork1();

        //Задание 2.
        homeWork2();

        //Задание 3.
        homeWork3();

        //Задание 4.
        homeWork4();

        //Задание 5.
        System.out.println(Arrays.toString(homeWork5(5,6)));

        //Задание 6.
        homeWork6();

        //Задание 7.
        System.out.println(homeWork7(new int[]{4,4,2,3,4,9} ));

        //Задание 8.
        homeWork8(new int[]{1, 2, 3, 4, 5},-2);
    }

    private static void homeWork1() {
        int[] arreys = {0, 1, 1, 0, 0, 0, 1, 0, 0, 1};
        for(int i=0;i<arreys.length;i++){
            if (arreys[i] == 0){
                arreys[i] = 1;
            }
            else if(arreys[i] == 1){
                arreys[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arreys));
    }

    private static void homeWork2() {
        int[] arreys2 = new int[100];
        for(int i = 0; i<100;i++){
            arreys2 [i] = (i+1);
        }
        System.out.println(Arrays.toString(arreys2));
    }

    private static void homeWork3() {
        int[] arreys3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<arreys3.length;i++){
            if(arreys3[i] < 6){
                arreys3[i] = (arreys3[i]*6);
            }
        }
        System.out.println(Arrays.toString(arreys3));
    }

    private static void homeWork4() {
        int[][] arr = new int [10][10];
        for(int i=0;i<arr.length;i++){
            int j;
            for (j = 0;j<arr.length;j++){
                if(i == j){
                    arr[i][j] = 1;
                }
            }
            for (j=0;j<arr.length;j++){
                if((arr.length-i-1) == j){
                    arr[i][j] = 1;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] homeWork5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    private static void homeWork6() {
        int[] arreys6 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arreys6[0];
        for (int i =0;i<arreys6.length;i++){
            if(arreys6[i]>max){
                max = arreys6[i];
            }
        }
        System.out.println(max);

        int min = arreys6[0];
        for (int i =0;i<arreys6.length;i++){
            if(arreys6[i]<min){
                min = arreys6[i];
            }
        }
        System.out.println(min);
    }

    public static boolean homeWork7(int[] arreys7){
        for(int i=0; i<arreys7.length-2;i++){
            int summ1 =0;
            for (int j=0; j<=i;j++){
                summ1 = summ1 + arreys7[j];
            }

            int summ2 =0;
            for (int k = i+1;k<arreys7.length;k++){
                summ2 = summ2 + arreys7[k];
            }
            if(summ1 == summ2){
                return true;
            }
        }
        return false;
    }

    //Задание 8.
    public static void homeWork8(int[] arreys8, int n){
        //{4,3,8,6}
        if(n>0) {
            for (int k = 0; k < n; k++) {
                int j = arreys8[0];
                for (int i = 0; i < arreys8.length - 1; i++) {
                    arreys8[i] = arreys8[i + 1];
                }
                arreys8[arreys8.length - 1] = j;
            }
        }
        if(n<0){
            for (int k = 0; k < (-n); k++) {
                int j = arreys8[arreys8.length-1];
                for (int i=arreys8.length-1; i>0; i--) {
                    arreys8[i] = arreys8[i-1];
                }
                arreys8[0] = j;
            }
        }
        System.out.println(Arrays.toString(arreys8));
    }
}
