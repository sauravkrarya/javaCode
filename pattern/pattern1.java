import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        int i,j;
        int plus=1;
        for(i=1; i<=4; i++){
            for(j=1 ;j<=i; j++){

                System.out.print("*");
                plus++;
             }
            System.out.println("");
        }
        
    }
    
}
