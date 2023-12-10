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
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Student> list = new ArrayList<>();
        
        while(n-- > 0) {
        	st = new StringTokenizer(br.readLine());
        	String name = st.nextToken();
        	int kor = Integer.parseInt(st.nextToken());
        	int eng = Integer.parseInt(st.nextToken());
        	int math = Integer.parseInt(st.nextToken());
        	
        	list.add(new Student(name, kor, eng, math));
        }
        
        Collections.sort(list);
        
        for( Student s : list) {
        	System.out.println(s.name);
        }
    }
    
    static class Student implements Comparable<Student> {
    	String name;
    	int kor;
    	int eng;
    	int math;
		
    	public Student(String name, int kor, int eng, int math) {
    		this.name = name;
    		this.kor = kor;
    		this.eng = eng;
    		this.math = math;
    	}
    	
    	@Override
    	public int compareTo(Student s1) {
			// TODO Auto-generated method stub
    		if(this.kor == s1.kor) {
    			if(this.eng == s1.eng ) {
    				if(this.math == s1.math) {
    					return this.name.compareTo(s1.name);
    				}
    				return s1.math - this.math;
    			}
    			return this.eng - s1.eng;
    		}
    		return s1.kor - this.kor;
		}
    }
}