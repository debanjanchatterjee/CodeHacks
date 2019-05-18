import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        String rev="";
        int l=in.length();
        for(int i=0;i<l;i++)
        {
            char c=in.charAt(i);
            rev=c+rev;
            
        }
        if(in.compareTo(rev)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        

    }
}
