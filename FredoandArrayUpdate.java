
import java.util.*;
class TestClass {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        int arr[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
            
        }
        s=s+1;
        double x=(double)s/n;
        int res=(int)Math.ceil(x);
        System.out.println(res);
        
    }
}
