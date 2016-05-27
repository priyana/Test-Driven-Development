package asgn2Aircraft;

public class AircraftException extends Exception
{

	public AircraftException(java.lang.String message)
	{
		Throwable t = null;

        initCause(t);
        fillInStackTrace();
        getMessage();
	}
	
}
