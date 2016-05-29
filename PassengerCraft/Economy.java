package asgn2Passengers;

/**
 * This class is used to represent the characteristics of a booking process of Economy Passenger 
 *
 * This is class subclass of Passenger class, so this class can use all methods and variable 
 * of Passenger Class
 * @author CAB302
 * @version 1.0
 */
public class Economy extends Passenger
{

	/**
	 * 	Economy(int,int) constructor of this Economy class, this constructor check set new booking and departure Time 
	 *  of any Passenger
	 */
	public Economy(int bookingTime,int departureTime)throws PassengerException
	{
		/**
		 *  This condition check booking and departuretime 
		 */
		if((bookingTime<0 && bookingTime>24) || (departureTime<0 && departureTime>24))
		{
			throw new PassengerException("Invalid Booking or DepartureTime");
		}
		else
		{
			this.bookingTime = bookingTime;
			this.departureTime = departureTime;
		}
	}
	
	/**
	 * This is no-argument Economy() constructor
	 */
	protected Economy()
	{
		
	}
	
	/**
	 *  This method is override from Passenger Class, this method call when no seat available
	 */
	@Override
	public String noSeatsMsg() {
		// TODO Auto-generated method stub
		return "no seats available";
	}

	/**
	 *  This method is also override from Passenger Class, this method upgrade passenger information if any 
	 *  change in booking system
	 */
	@Override
	public Passenger upgrade() {
		// TODO Auto-generated method stub
		return null;
	}

}
