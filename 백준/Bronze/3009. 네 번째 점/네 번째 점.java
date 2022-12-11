import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	int ar1[] = new int[3];
    	int ar2[] = new int[3];
    	
    	for(int i=0;i<3;i++) {
    		ar1[i] =sc.nextInt();
    		ar2[i] =sc.nextInt();
    	}
    	
    	int a;
    	int b;
    	
    	if(ar1[0] == ar1[1]){
    		a = ar1[2];
    	}else if(ar1[0] == ar1[2]){
    		a = ar1[1];
    	}else {
    		a = ar1[0];
    	}
    	
    	if(ar2[0] == ar2[1]){
    		b = ar2[2];
    	}else if(ar2[0] == ar2[2]){
    		b = ar2[1];
    	}else {
    		b = ar2[0];
    	}
    	
    	System.out.println(a + " " + b);
    }
}

