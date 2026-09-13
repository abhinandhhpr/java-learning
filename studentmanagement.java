import java.util.Scanner;
public class studentmanagement{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the student name :");
        String name=input.nextLine();
        System.out.print("enter java marks: ");
        int javamark=input.nextInt();
        System.out.print("enter python marks: ");
        int pythonmark=input.nextInt();
        System.out.print("enter os marks: ");
        int osmark=input.nextInt();
        int total=javamark+pythonmark+osmark;
        double average=total/3;
        char grade;
        if(average>=90)
        {
            grade='A';
        }
        else if(average>=80)
        {
            grade='B';
        }
        else if(average>=70)
        {
            grade='C';

        }
        else if(average>=60)
        {
            grade='D';
        }
        else
        {
            grade='F';

        }
        System.out.println("student name:"+name);
        System.out.println("java marks:"+javamark);
        System.out.println("python marks:"+pythonmark);
        System.out.println("os marks:"+osmark);
        System.out.println("total marks:"+total);
        System.out.println("average marks:"+average);
        System.out.println("grade:"+grade);
        }
        }


    