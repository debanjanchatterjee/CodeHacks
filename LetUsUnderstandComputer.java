import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        int i;
        long n,res;
        for(i=1;i<=T;i++)
        {
            n=sc.nextLong();
            res=findDiv(n);
            System.out.println(res);
        }
        
    }
    static long findDiv(long n)
    {
        long i;
        int ovf;
        long count=0;
        for(i=1;i<=n;i++)
        {
            ovf=checkOverflow(n,i);
            if(ovf != 1)
            {
                count++;
            }
        }
        return count;
    }
    
    static int checkOverflow(long n,long d)
    {
        long q=n/d;
        double a=findBits(q);
        double b=findBits(d);
        if(a>b)
            return 1;
        else
            return 0;
    }
    static double findBits(long n)
    {
        double x=Math.log(n)/Math.log(2);
        x=Math.floor(x);
        return x;
    }
}