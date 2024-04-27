import java.util.*;
public class Lecture4{
    public static void main(String[]args){
        System.out.println("Hello World");
        for(int i=0;i<10;i++){
            System.out.println("Hello");

        }
        hello(args);
        forloop(args);
        whileloop(args);
        dowhileloop(args);
        questions(args);
    }

    public static void hello(String[]args){
        for(int i=0;i<11;i++){
            System.out.print(i +" ");
        }
    } 


    public static void forloop(String[]args){
        System.out.println("\nFor Loop");
        for (int i=0;i<11;i++){
        
            System.out.println(i);
        }
    }
    public static void whileloop(String[]args){
      
        System.out.println("\nWhile loop");
        int i=0;
        while(i<11){
            System.out.println(i);
            i=i+1;
        }
    }   
    public static void dowhileloop(String[]args){
        System.out.println("Do While Loop");
        int i=0;
        do{
            System.out.println(i);
            i=i+1;
        } while(i<11);


    }

    public static void questions(String [] args){
        System.out.println("Questions");
        //sum of n natural numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum is: ");
        System.out.println(sum);
        sc.close();


    }
    

    
    
}