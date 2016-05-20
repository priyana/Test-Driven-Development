package asgn2Passengers;

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
	
	protected	Passenger()
	{
		
	}
	public Passenger(int bookingTime,int departureTime) throws PassengerException
	{
		if (bookingTime < 0 || departureTime <= 0 || departureTime < bookingTime)
		{
		}
	}
	void cancelSeat(int cancellationTime)
	{
		
	}
	void confirmSeat(int confirmationTime, int departureTime)
	{
		
	}
	protected void	copyPassengerState(Passenger p)
	{
		
		
	}
	void	flyPassenger(int departureTime)
	{
		
	}
	int	getBookingTime()
	{
		return 0;
	}
	int	getConfirmationTime()
	{
		return 0;
	}
	int	getDepartureTime()
	{
		return 0;
	}
	int	getEnterQueueTime()
	{
		return 0;
	}
	int	getExitQueueTime()
	{
		return 0;
	}
	java.lang.String	getPassID()
	{
		return "";
	}
	boolean	isConfirmed()
	{
		return true;
	}
	boolean	isFlown()
	{
		return true;
	}
	boolean	isNew()
	{
		return true;
	}
	boolean	isQueued()
	{
		return true;
	}
	boolean	isRefused()
	{
		return true;
	}
	abstract java.lang.String	noSeatsMsg();
	void	queuePassenger(int queueTime, int departureTime)
	{
		
	}
	void	refusePassenger(int refusalTime)
	{
		
	}
	public java.lang.String toString() 
	{
		return "";
	}
	abstract Passenger	upgrade();
	boolean	wasConfirmed()
	{
		return true;
	}
	boolean	wasQueued()
	{
		return true;
	}
}
