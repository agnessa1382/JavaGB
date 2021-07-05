import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';
    public static final char DOT_EMPTY = '.';


    public static void main(String[] args) {
        initMAP();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if(isVinner(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }

           aiTurn();
            printMap();
            if(isVinner(DOT_O)){
                System.out.println("Победил компьютер");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMAP(){
        map = new char[SIZE][SIZE];
        for (int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(){
        for(int i=0; i<=SIZE;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 0;i<SIZE;i++){
            System.out.print((i+1)+" ");
            for(int j =0;j<SIZE;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void humanTurn(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do{
            System.out.println("Введите координаты в стиле X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        }
        while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn(){
        Random random = new Random();
        int x;
        int y;
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isCellValid(x, y));

        System.out.println("Компьютер поставил нолик на точку" + (x+1) + (y+1));

        map[y][x] = DOT_O;
    }


    public static boolean isCellValid(int x, int y){
        if(x<0 || x>= SIZE || y<0 || y>=SIZE){
            return false;
        }
        if(map[y][x] == DOT_EMPTY){
            return true;
        }
        return false;
    }

    public static boolean isVinner(char sumb){
        for (int i =0;i<SIZE;i++){
            if(map[i][0] == sumb && map[i][1] == sumb && map[i][2] == sumb && map[i][3] == sumb){
                return true;
            }
            if(map[0][i] == sumb && map[1][i] == sumb && map[2][i] == sumb && map[3][i] == sumb){
                return true;
            }

            if(map[i][1] == sumb && map[i][2] == sumb && map[i][3] == sumb && map[i][4] == sumb){
                return true;
            }
            if(map[1][i] == sumb && map[2][i] == sumb && map[3][i] == sumb && map[4][i] == sumb){
                return true;
            }
        }

        for (int i=0;i<=1;i++){
            for (int j=0; j<=1;j++){
                if(map[0+i][0+j] == sumb && map[1+i][1+j] == sumb && map[2+i][2+j] == sumb && map[3+i][3+j] == sumb){
                    return true;
                }
                if(map[0+i][4-j] == sumb && map[1+i][3-j] == sumb && map[2+i][2-j] == sumb && map[3+i][1-j] == sumb){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull(){
        for(int i=0; i<SIZE;i++){
            for (int j =0; j<SIZE; j++){
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
}
