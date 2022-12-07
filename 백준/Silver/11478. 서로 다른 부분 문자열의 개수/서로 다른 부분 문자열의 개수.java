import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set1 = new HashSet<>();

        String str = br.readLine();
        String ss = "";
        for(int i=0;i<str.length();i++) {
        	ss = "";
        	for(int j=i;j<str.length();j++) {
        		ss += str.substring(j,j+1);
        		set1.add(ss);
        	}
        }
        System.out.println(set1.size());
    }
}

