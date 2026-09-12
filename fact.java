import java.io.*;
public class fact
{
    public static void main(String args[])
    {
        int[] num=new int[10];
        if(args.length==0)
        {
            System.out.println("no command line argument passed");
            return;
        }
        for(int i=0;i<args.length;i++)
        num[i]=Integer.parseInt(args[i]);
        for(int i=0;i<args.length;i++)
        {
            int fact=1;
            for(int j=1;j<=num[i];j++)
            fact=fact*j;
            System.out.println("the factorial of"+args[i]+"is:"+fact);

        }
        }
    }