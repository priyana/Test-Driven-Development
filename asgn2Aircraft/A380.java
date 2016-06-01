/**
 * 
 * This file is part of the AircraftSimulator Project, written as 
 * part of the assessment for CAB302, semester 1, 2016. 
 * 
 */
package asgn2Aircraft;


/**
 * Specialisation of the {@link asgn2Aircraft.Aircraft} class for the Airbus A380-800. 
 * Default passenger capacities are based on the QANTAS four class configuration 
 * 
 * @author hogan
 * @author Conrad Bell
 */
public class A380 extends Aircraft {
	
	static final int FIRST = 14;
	static final int BUSINESS = 64;
	static final int PREMIUM = 35;
	static final int ECONOMY = 371;

	
	/**
	 * Constructor for A380 uses default fare class capacities 
	 * 
	 * @param flightCode <code>String</code> containing flight ID 
	 * @param departureTime <code>int</code> scheduled departure time
	 * @throws AircraftException if invalid parameters. 
	 * See {@link asgn2Aircraft.Aircraft#Aircraft(String, int, int, int, int, int)}
	 */
	public A380(String flightCode,int departureTime) throws AircraftException {
		if(flightCode == null){
		throw new AircraftException("Flight code is missing.");
		}
		if(departureTime <= 0){
			throw new AircraftException("Aircraft has already departed.");
		}
		this.flightCode = flightCode;
		this.departureTime = departureTime;
		this.firstCapacity = FIRST;
		this.businessCapacity = BUSINESS;
		this.premiumCapacity = PREMIUM;
		this.economyCapacity = ECONOMY;
		this.capacity = firstCapacity + businessCapacity + premiumCapacity + economyCapacity;
		this.type = "A380";
	}

	/**
	 * Constructor for A380 sets all fare class capacities 
	 * 
	 * @see asgn2Aircraft.Aircraft#Aircraft(String, int, int, int, int, int) 
	 */
	public A380(String flightCode,int departureTime,int first, int business, int premium, int economy) throws AircraftException {
		if(flightCode == null){
		throw new AircraftException("Flight code is missing.");
		}
		if(departureTime <= 0){
			throw new AircraftException("Aircraft has already departed.");
		}
		if(first < 0){
			throw new AircraftException("First class is not entered.");
		}
		if(business < 0){
			throw new AircraftException("Business class is not entered.");			
		}
		if(premium < 0){
			throw new AircraftException("Premium Economy class is not entered.");
		}
		if(economy < 0){
			throw new AircraftException("Economy class is not entered.");
		}
		this.flightCode = flightCode;
		this.departureTime = departureTime;
		this.firstCapacity = first;
		this.businessCapacity = business;
		this.premiumCapacity = premium;
		this.economyCapacity = economy;
		this.capacity = firstCapacity + businessCapacity + premiumCapacity + economyCapacity;
		this.type = "A380";
	}
	/**
	 ** Simple no-argument constructor to support subclass access
	 **/
	 protected A380() {
		 
	 }
}
