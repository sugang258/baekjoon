import java.util.Scanner;

class Main{
	static int[] A,tmp;
	static int k;
	static int cnt;
	static int result = -1;
	
	public static void merge(int p, int q, int r){
		int i= p;
		int j = q+1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t++] = A[i++];
			}else {
				tmp[t++] = A[j++];
			}
		}
		
		while(i<=q) {
			tmp[t++] = A[i++];
		}
		while(j<=r) {
			tmp[t++] = A[j++];
		}
		i = p;
		t = 0;
		
		while(i<=r) {
			cnt++;
			if(cnt == k) {
				result = tmp[t];
				break;
			}
			A[i++] = tmp[t++];
		}
    }
	
    public static void merge_sort(int p, int r){
    	if(cnt > k) return;
    	int q;
    	if(p<r) {
    		q =(p+r) / 2;
    		merge_sort(p,q);
    		merge_sort(q+1,r);
    		merge(p,q,r);
    	}
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        k = sc.nextInt();
        
        A = new int[t];
        
        for(int i=0;i<t;i++) {
        	A[i] = sc.nextInt();
        }
        
        tmp = new int[t];
        merge_sort(0,t-1);
        System.out.println(result);
        

    }
}
