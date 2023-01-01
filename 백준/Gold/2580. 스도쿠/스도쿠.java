import java.io.IOException;
import java.util.Scanner;

class Main{

	static int[][] ar = new int[9][9];
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<9;j++) {
    			ar[i][j] = sc.nextInt();
    		}
    	}
    	
    	play(0,0);
    }
    
    //빈칸 찾기
    static void play(int row,int col) {
    	
    	if(col == 9) {
    		play(row+1,0);
            return;
    	}
    	
    	if(row ==9) {
    		for(int i=0;i<9;i++) {
    			for(int j=0;j<9;j++) {
    				System.out.print(ar[i][j]+" ");
    			}
    			System.out.println();
    		}
    		
    		System.exit(0);
    	}
    	
    	if(ar[row][col] == 0) {
    		for(int i=1;i<=9;i++) {
    			if(check(row,col,i)) {
    				ar[row][col] = i;
    				play(row,col+1);
    			}
    		}
    		
    		ar[row][col] = 0;
    		return;
    	}
    	
    	play(row,col+1);
    }
    
    static boolean check(int i,int j,int value) {
    	
    	int set_row = (i/3)*3;
    	int set_col = (j/3)*3;
    	
    	//같은 행, 같은 열
    	for(int a=0;a<9;a++) {
    		if(ar[i][a] == value)	{
    			return false;
    		}
    		if(ar[a][j] == value) {
    			return false;
    		}
    	}
    	
    	//3x3
    	for(int x=set_row;x<set_row+3;x++) {
    		for(int y=set_col;y<set_col+3;y++) {
    			if(ar[x][y] == value) {
    				return false;
    			}
    		}
    	}
    	return true;
    	
    }
    
   
    
   
   
}

