package asgn2Passengers;

/**
 * This class is used to represent the characteristics of a all Passenger's booking,confirm,departure,flown,queue,
 * refused process.
 * 
 * This class manage all passenger current status.
 *
 * This is class superclass of Business,Economy,First,Premium class
 * 
 * @author CAB302
 * @version 1.0
 */


public abstract class Passenger extends java.lang.Object 
{
	
	protected int	bookingTime; 
	protected int	confirmationTime; 
	protected boolean	confirmed; 
	protected int	departureTime; 
	protected int	enterQueueTime; 
	protected int	exitQueueTime; 
	protected boolean	flown; 
	protected boolean	inQueue; 
	protected boolean	newState; 
	protected java.lang.String	passID; 
	protected boolean	refused;
	
	/**
	 * This is no-argument Passenger constructor
	 */
	protected	Passenger()
	{
		
	}
	
	/**
     * Constructs a passenger  with the given bookingTime and departureTime
     * See the constructor in
     * class Passenger for details about valid container booking.
     *
     * @param bookingtime the container 's first booking time
     * @param departureTime the container 's first departureTime
     
     * @throws PassengerException if the "bookingTime < 0 || departureTime <= 0 || departureTime < bookingTime"
     */
	public Passenger(int bookingTime,int departureTime) throws PassengerException
	{
		if (bookingTime < 0 || departureTime <= 0 || departureTime < bookingTime)
		{
		}
	}
	
	/**
     * method cancelseat with the given cancellationTime
     * @param cancellationTime the container 's cancel booking
     * @throws PassengerException if isNew(this) OR isQueued(this) OR isRefused(this) OR isFlown(this) OR (cancellationTime < 0) OR (departureTime < cancellationTime)
     */
	public void cancelSeat(int cancellationTime)
	{
		
	}
	
	/**
     * method confirmSeat with the given confirmationTime,departureTime
     * @param confirmationTime the container 's confirm booking time
     * @param departureTime the container 's confirm departure time
     * @throws PassengerException if isConfirmed(this) OR isRefused(this) OR isFlown(this) OR (confirmationTime < 0) OR (departureTime < confirmationTime)
     */
	public void confirmSeat(int confirmationTime, int departureTime)
	{
		
	}
	
	/**
     * method copyPassengerState with the given Passenger details
     * @param Passenger P the container 's copy of confirm passenger
     */
	protected void	copyPassengerState(Passenger p)
	{
		
		
	}
	
	/**
     * method flyPassenger with the given departureTime
     * @param departureTime the container 's confirm departure time of plane
     * @throws PassengerException if isNew(this) OR isQueued(this) OR isRefused(this) OR isFlown(this) OR (departureTime <= 0)
     */
	public void flyPassenger(int departureTime)
	{
		
	}
	
	/**
     * method getBookingTime with the return booking timing
     */
	public int	getBookingTime()
	{
		return 0;
	}
	
	/**
     * method getConfirmationTime with the return booking confirm timing
     */
	public int	getConfirmationTime()
	{
		return 0;
	}
	
	/**
     * method getDepartureTime with the return departure timing
     */
	public int	getDepartureTime()
	{
		return 0;
	}
	
	/**
     * method getEnterQueueTime with the return enter queue time
     */
	public int	getEnterQueueTime()
	{
		return 0;
	}
	
	/**
     * method getExitQueueTime with the return exit queue time
     */
	public int	getExitQueueTime()
	{
		return 0;
	}
	
	/**
     * method getPassID with the return passenger booking id number
     */
	public java.lang.String	getPassID()
	{
		return "";
	}
	
	/**
     * method isConfirmed with the return true / false value 
     * true -> booking confirm
     * false -> booking waiting / cancle
     */
	public boolean	isConfirmed()
	{
		return true;
	}
	
	/**
     * method isFlown with the return true / false value 
     * true -> passeger is in Flown state
     * false -> passeger is not in Flown state
     */
	public boolean	isFlown()
	{
		return true;
	}
	
	/**
     * method isNew with the return true / false value 
     * true -> passeger is new booking
     * false -> passeger is old booking
     */
	public boolean	isNew()
	{
		return true;
	}
	
	/**
     * method isQueued with the return true / false value 
     * true -> passeger is waiting
     * false -> passeger is cancle or confirm
     */
	public boolean	isQueued()
	{
		return true;
	}
	
	/**
     * method isRefused with the return true / false value 
     * true -> passeger is cancle booking
     * false -> passeger is waiting
     */
	public boolean	isRefused()
	{
		return true;
	}
	
	/**
     * method noSeatsMsg with the return "no seat available" message 
     * method is abstract so only declaration sallow in this class
     * we will see this method in subclasses
     */
	abstract java.lang.String	noSeatsMsg();
	
	/**
     * method queuePassenger with the given queueTime,departureTime
     * @param queueTime the container 's passenger waiting time
     * @param departureTime the container 's confirm departure time
     * @throws PassengerException  if isQueued(this) OR isConfirmed(this) OR isRefused(this) OR isFlown(this) OR (queueTime < 0) OR (departureTime < queueTime)
     */
	public void	queuePassenger(int queueTime, int departureTime)
	{
		
	}
	
	/**
     * method refusePassenger with the given refusalTime
     * @param refusalTime the container 's passenger refusalTime time
     * @throws PassengerException  if isConfirmed(this) OR isRefused(this) OR isFlown(this) OR (refusalTime < 0) OR (refusalTime < bookingTime)
     */
	public void	refusePassenger(int refusalTime)
	{
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public java.lang.String toString() 
	{
		return "";
	}
	
	/**
     * method upgrade with the return Passenger updation and modification details 
     * method is abstract so only declaration allow in this class
     * we will see this method in subclasses
     */
	abstract Passenger	upgrade();
	
	
	/**
     * method wasConfirmed with the return true / false value 
     * true -> booking was Confirmed state
     * false -> booking was not confirm state
     */
	public boolean	wasConfirmed()
	{
		return true;
	}
	
	/**
     * method wasQueued with the return true / false value 
     * true -> booking was Queued state
     * false -> booking was not was Queued state
     */
	public boolean	wasQueued()
	{
		return true;
	}
}
