import java.util.Scanner;
public class PizzaPalace {
    
    
    public static void main(String[] args) {
        
        double numPeople = 0.0;
        double numSlices = 0.0;
        int slicesPerPie = 0;
        double slicesNeeded = 0.0;
        
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many people are there? ");
        numPeople = scnr.nextDouble();
        System.out.println("How many slices per person? ");
        numSlices = scnr.nextDouble();
        System.out.println("How many slices in a pizza? ");
        slicesPerPie = scnr.nextInt();
        
        slicesNeeded = numPeople * numSlices;
        slicesNeeded = slicesNeeded / slicesPerPie;
        
        System.out.println("You will need " + Math.ceil(slicesNeeded) + " pizzas!");
        
        
        
    }
    
}


