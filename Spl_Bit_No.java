/*
A number, which when converted to its binary equivalent, has two or more consecutive 1s is called a special bit number.


The program accepts an integer array of size n, along with certain Q queries (Left and Right). It prints the number of special bit numbers occuring within the specified range for each query.
*/
import java.util.Scanner;
class Spl_Bit_No
{
    int convert(int y)
    {
        int arr[]=new int [10000];
        int d;
        int i=0;
        int c=0;
        while(y>0)
        {
            d=y%2;
            arr[i++]=d;
            y=y/2;
            c++;
        }
        for(i=0;i<c-1;i++)
        {
            if(arr[i]==1 && arr[i+1]==1)
            {
                return 1;
            }
        }
        return 0;
        
    }
    public static void main(String args[] ) throws Exception 
    {
        TestClass ob=new TestClass();
        int i,j;
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        int q[][]=new int[x][2];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<x;i++)
        {
            q[i][0]=sc.nextInt()-1;
            q[i][1]=sc.nextInt()-1;
        }
        for(i=0;i<x;i++)
        {
            for(j=q[i][0];j<=q[i][1];j++)
            {
                int num=a[j];
                int flag=ob.convert(num);
                if(flag==1)
                    count++;
                
            }
            System.out.println(count);
            count=0;
        }
    }
}
        
       