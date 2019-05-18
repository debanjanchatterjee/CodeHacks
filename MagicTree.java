import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        String str="";
        int i,a;
        int l,j;
        char c,ch;
        int total=0;
        int max=0;
        
        for(i=0;i<L;i++)
        {
            str=sc.nextLine();
            l=str.length();
            for(j=0;j<l;j++)
            {
                c=str.charAt(j);
                if(c=='+')
                {
                    ch=str.charAt(j+1);
                    a=Integer.parseInt(String.valueOf(ch));
                    total+=a;
                    j++;
                }
                else if(c=='-')
                {
                    ch=str.charAt(j+1);
                    a=Integer.parseInt(String.valueOf(ch));
                    total-=a;
                    j++;
                }
                else
                {
                    total=Integer.parseInt(String.valueOf(c));
                }
                
            }
            if(total>max)
                max=total;
            total=0;
            
        }
        System.out.println(max);
            
            
        
    }
}