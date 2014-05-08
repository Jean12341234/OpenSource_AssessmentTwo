package fuelpurchase;
import java.util.*;
/**
 *
 * @author 041209329
 */
public class Main {
        /**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("           >>> THE FUEL ECONOMY <<<");
                System.out.println("Audio A6, Jaguar X200 & Mercedes-Benz CL600 C220");
                System.out.println("------------------------------------------------");
                
                //Gerakd added some vehicles
		Vehicle A = new Vehicle("Audi", "A6", 2014);
                Vehicle J = new Vehicle ("Jaguar", "X200", 2013);
                Vehicle M = new Vehicle ("Mercedes-Benz", "CL600-C220", 2014);
		
		//Jean arranged the codes by their Vehicle class A,J,M
		// Vehicle A distance
		for (int i = 0; i < 10; i++) {
			A.addKilometers(new Random().nextInt(100));
		}
                System.out.println("\n\n");
                A.printDetails();
                
                // Vehicle J distance
                for (int i = 0; i < 10; i++) {
                        J.addKilometers(new Random().nextInt(100));
                }
                System.out.println("\n\n");
                J.printDetails();
                
                // Vehicle M distance
                for (int i = 0; i < 10; i++) {
                        M.addKilometers(new Random().nextInt(100));
                }
                System.out.println("\n\n");
                M.printDetails();
        
        
        }

}
