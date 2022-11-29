import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[][] location = new int[15][15];
        for(int i=0;i<15;i++) {
            location[i][1] = 1;
            location[0][i] = i;
        }
        
        for(int i=1;i<15;i++){
            for (int j =2;j<15;j++){
                location[i][j] = location[i][j-1]+location[i-1][j];
            }
        }
        
        for(int i=0;i<T;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(location[k][n]);   
        }         
    }

}