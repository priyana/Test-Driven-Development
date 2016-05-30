/**
 * 
 */
package asgn2Passengers;

/**
 * @author hogan
 * @author priyanka patel
 */
public class Economy extends Passenger {

	/**
	 * Economy Constructor (Partially Supplied)
	 * Passenger is created in New state, later given a Confirmed Economy Class reservation, 
	 * Queued, or Refused booking if waiting list is full. 
	 * 
	 * @param bookingTime <code>int</code> day of the original booking. 
	 * @param departureTime <code>int</code> day of the intended flight.  
	 * @throws PassengerException if invalid bookingTime or departureTime 
	 * @see asgnPassengers.Passenger#Passenger(int,int)
	 */
	public Economy(int bookingTime,int departureTime) throws PassengerException {
		if((bookingTime<0 && bookingTime>24) || (departureTime<0 && departureTime>24))
		{
			throw new PassengerException("Invalid Booking or DepartureTime");
		}
		else
		{
			this.bookingTime = bookingTime;
			this.departureTime = departureTime;
			this.passID = "Y:" + this.passID;
		}
	}
	
	/**
	 * Simple constructor to support {@link asgn2Passengers.Passenger#upgrade()} in other subclasses
	 */
	protected Economy() {

	}
	
	@Override
	public String noSeatsMsg() {
		return "No seats available in Economy";
	}

	@Override
	public Passenger upgrade() {
		// TODO Auto-generated method stub
		return null;
	}
}
