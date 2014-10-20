/**
Will Fox 
*/

import java.util.Scanner;
public class Grader {
    
    public static void main(String[] args) {
        double pointsPossible = 0.0;
        double pointsMissed = 0.0;
        double points = 0.0;
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many points are possible?");
        pointsPossible = scnr.nextDouble();
        
        while (pointsPossible > 0.0) {
            
            System.out.println("How many points were missed? (Negative number to exit)");
            pointsMissed = scnr.nextDouble();
            
            if (pointsMissed >= 0) {
                
                points = pointsPossible - pointsMissed;
                System.out.println("The grade is " + points / pointsPossible * 100);
                
            }else {
                
                System.out.print("Thank you");
                
                return;
                
            }
            
        }
        
        
        
    }
    
    
}
