/*
For a input string S, we have to find the substring which on changing minimum number of characters will yield the word "barclays".
The code displays the starting index positions of the substring and the index positions of the characters that needed to be changed to get "barclays".
*/
import java.util.Scanner;
class Find_Subword {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int i,j;
        int c=0;
        int l=s.length();
        int min=999;
        String sub="";
        String m="barclays";
        String sub1="";
        int index=0;
        for(i=0;i<=l-8;i++)
        {
            sub=s.substring(i,i+8);
            
            for(j=0;j<8;j++)
            {
                char x=sub.charAt(j);
                char y=m.charAt(j);
                if(x!=y)
                    c++;
            }
            if(c<min)
            {
                min=c; 
                index=i;
            }
            c=0;
            
        }
        System.out.println(min);
        
        for(j=0;j<8;j++)
        {   
            sub1=s.substring(index,index+8);
            
            char x=sub1.charAt(j);
            char y=m.charAt(j);
            if(x!=y)
                System.out.print((index+j+1)+" ");        
            
        }
    }
}