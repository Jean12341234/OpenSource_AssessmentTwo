
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelpurchase;
//Jean added a package to generate random
import java.util.Random;

/**
 *
 * @author 041209329
 */
public class Journey {
    
	private static final int	SERVICE_KILOMETER_LIMIT	= 100;
	private double				kilometers;
        private double                            litres;
	/**
	 * Class constructor
	 */
	public Journey() {
		this.kilometers = 0;
                this.litres = 0;
        }

	/**
	 * Appends the distance parameter to {@link #kilometers}
	 * @param kilometers the distance traveled 
	 */
	public void addKilometers(double kilometers) {
		System.err.println(this.kilometers);
		System.err.println(kilometers);
		this.kilometers += kilometers;
	}

	/**
	 * Calculates the total services by dividing kilometers by
	 * {@link #SERVICE_KILOMETER_LIMIT} and floors the value (Truncates the two
	 * decimal places).
	 * 
	 * @return the number of services needed per
	 *         {@link #SERVICE_KILOMETER_LIMIT}
	 */
	public int getTotalServices() {
		return (int) Math.floor(kilometers / SERVICE_KILOMETER_LIMIT);
        }
       
        

	/**
	 * 
	 * @return {@link #kilometers #litres}
	 */
	public double getKilometers() {
		return kilometers;
        }
        //Jeans change
        public double getLiters() {
                return (new Random().nextInt(100) * 100 / kilometers);
        }
        
        // Gerald add this code to ger fuel consumption
        public double fuelEconomy() {
        	return kilometers / getliters;
        }

}
