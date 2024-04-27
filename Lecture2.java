import java.util.*;

public class Lecture2{
    public static void main(String args [])
    {
        System.out.println("Hello World...!!");
        System.out.println("Excuses never build empires ....!!!!\n\nHello world with java");
        System.out.println("Hellomoto");
        System.out.println("\n");

        System.out.println("*\n**\n***\n****\n*****\n\n");
        //quiz question
        System.out.println("*\n**");
        //variables
        String name="gauri";
        int a=33;
        int b=90;
        double price=34.787;
        System.out.println(name);   
        int sum= a+b;
        System.out.println(sum);
        System.out.println(price);
        System.out.println(b-a);
        int diff=b-a;
        System.out.println(diff);
        int mul=a*b;
        System.out.println("The required multiplication is :"+ mul);

        //quiz question
        int d=10;
        int e=5;
        int ans=(d*e)/(d-e);
        System.out.println(ans);

        //input
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your name:");
        String namee = sc.nextLine();
        System.out.println("Hello "+ namee);

        //quiz question
        Scanner i=new Scanner (System.in);
        System.out.print("Enter the first integer:");
        int num1=i.nextInt();
        Scanner y=new Scanner(System.in);
        System.out.print("Enter the second integer:");
        int num2=y.nextInt();
        int summ=num1+num2;
        System.out.println("The Addition of the two numbers is:"+summ);
        int multi=num1*num2;
        System.out.println("The Multiplication is:"+multi);
        int subtract=num2-num1;
        System.out.println("The Subtraction of 2nd int from 1st is:"+subtract);
        System.out.println("THANK YOU");

         i.close();
         y.close();
         sc.close();




    }
}