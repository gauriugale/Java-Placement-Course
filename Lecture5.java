

public class Lecture5 {
    public static void main(String [] args){
        System.out.println("Lecture 5");
        //SOLID RECTANGLE
        int n=4;
        int m=5; 
        for (int i=1 ; i<=n ; i++ ){
            for (int j=1 ; j<=m ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
     //HOLLOW RECTANGLE
       //outer loop
       for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=m;j++){
            //cell ->(i,j)
            if(i==1 ||j==1 || i==n || j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       } 
     
     //HALF PYRAMID
     //outer loop
     for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1; j<=i;j++){
           System.out.print("*");
     }
     System.out.println();

    }

    for(int i=n; i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("\n");
    //outer loop

// Outer loop for rows
for (int i = 1; i <= 4; i++) {
    // Inner loop for spaces
    for (int j = 1; j <= 4 - i; j++) {
        System.out.print(" ");
    }
    // Inner loop for stars
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println(); // Move to the next line after each row
}



    for(int i=1;i<=n;i++){
        //inner loop ->space print
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //inner loop ->star print
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

   

}
}
