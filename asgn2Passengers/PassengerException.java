package asgn2Passengers;

/**
 * This class represents any exceptions thrown by any of the Passenger,Business,First,Economy, Premium classes.
 *
 * @author CAB302
 * @version 1.0
 */

public class PassengerException extends java.lang.Exception
{
	/**
     * Constructs a new PassengerException object with a helpful message describing
     * the problem. (The message can be retrieved from the exception object via
     * the <code>getMessage</code> method inherited from class
     * <code>Throwable</code>.)
     */
   
	public PassengerException(java.lang.String message)
	{
		Throwable t = null;

        initCause(t);
        fillInStackTrace();
        getMessage();
	}
	
}
