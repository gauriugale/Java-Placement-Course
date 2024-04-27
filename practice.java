import java. util.*;
public class practice {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        switch(option){
            case 1:System.out.println("Namaste");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("bonjour");
            break;
            default: System.out.println("Invalid option");
            break;
            
        }
        sc.close();
        
        
    }
}
