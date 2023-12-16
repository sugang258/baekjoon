import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String s = br.readLine();
        ArrayList<String> ar = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {
        	ar.add(s.substring(i, s.length()));
        }
        
        Collections.sort(ar);
        
        for(int i=0;i<ar.size();i++) {
        	System.out.println(ar.get(i));
        } 
    }

}