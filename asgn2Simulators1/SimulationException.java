package asgn2Simulators;

public class SimulationException extends java.lang.Exception
{

	public SimulationException(java.lang.String message)
	{
		Throwable t = null;

        initCause(t);
        fillInStackTrace();
        getMessage();
	}
	
}
