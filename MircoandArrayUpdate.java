import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i,j,n,k;
        int arr[]=new int[2000000];
        for (i=0;i<t;i++)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            
            min=99999999;
            for(j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                if(arr[j]<min)
                    min=arr[j];
            }
            System.out.println(k-min);
            min=99999999;
                
        }
            
                
        
        }
            
        
    }