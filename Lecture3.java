import java.util.*;

public class Lecture3 {
    public static void main(String args[])
    {
        System.out.println("\nHello Welcome Back to Lecture3.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age=sc.nextInt();

        if(age > 18){
            System.out.println("Is Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        if(a==b)
            System.out.println("Equal");
        
        else if(a>b)
            System.out.println("a is greater");
        
        else
            System.out.println("b is greater");
        
        
        //Quiz Question
        //If 3 is an even number print bazinga
        //  if(3%2==0){
        //System.out.println("bazinga");
        System.out.print("Enter the choice from 1, 2 , 3:  ");
        int button= sc.nextInt();
        if(button==1)
        System.out.println("Hello");
        else if(button==2)
        System.out.println("Namaste");
        else if(button==3)
        System.out.println("Bonjour");
        else{
            System.out.println("Invalid Button");
        }

        // What if there are too many buttons???Hence we use Switch...
        System.out.print("Enter The Option: ");
        int option=sc.nextInt();
        switch(option){
            case 1 : System.out.println("Hello !");
            break;
            case 2 :System.out.println("Namaste !");
            break;
            case 3 : System.out.println("Bonjour !");
            break;
            default:System.out.println("Invalid Option.");
        }


        sc.close();
        
      }

    }
    

