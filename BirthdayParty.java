
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long arr[][]=new long[T][2];
        int i;
        for(i=0;i<T;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        
        for(i=0;i<T;i++)
        {
            if (arr[i][1]%arr[i][0]==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
       

    }
}