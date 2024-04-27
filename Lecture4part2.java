import java.util.*;
public class Lecture4part2{
    public static void main(String args[]){
        System.out.print("Enter the table no.: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int mul=1;
        for(int i=1;i<=10;i++){
            mul=i*n;
            System.out.println(mul);
        }
    s.close();
        }
    }