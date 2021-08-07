import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int HP=3;
        int x=0;
        int y=0;
        int f=3;
        int i1 = rand.nextInt(5)+1;
        int i2 = rand.nextInt(5)+1;
        int i = 1;
        int field[][] = new int[7][7];
        System.out.println("*****************");
        System.out.println("    戦艦ゲーム    ");
        System.out.println("*****************");
        for (int b = 0; b < 3; b++){
            while(field[i1][i2]>0){
            i1 = rand.nextInt(5)+1;
            i2 = rand.nextInt(5)+1;
        }
            field[i1][i2] = HP;
            System.out.println(i1+","+i2);
        }
        for (int a = 0; a < 20; a++) {
            try {
            System.out.printf("-----ターン%d-----\n", i++);
            x = sc.nextInt();
            y = sc.nextInt();
            if((field[x+1][y]>0)||(field[x-1][y]>0)||(field[x][y+1]>0)||(field[x][y-1]>0)){
                System.out.println("波高し");
            }
            if(field[x][y]>0){
                    field[x][y]-=1;
                    if (field[x][y]==0) {
                        System.out.println("撃破！！");
                        f--;
                    }else{
                        System.out.println("Hit!!残りHPは"+ field[x][y]);
                         while(field[i1][i2]>0){
                            i1 = rand.nextInt(5)+1;
                            i2 = rand.nextInt(5)+1;
                        }
                        HP = field[x][y];
                        field[i1][i2] = HP;
                        field[x][y]=0;
                        System.out.println(i1 + "," + i2);
                    }
            }
            if(f<1){
                System.out.println("FINISH!!!");
                a+=20;
            }
         } catch (Exception e) {
                System.out.println("ERROR!!");
                //a--;
            }
        }
    }
}