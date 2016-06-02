/**
 * 
 * This file is part of the AircraftSimulator Project, written as 
 * part of the assessment for CAB302, semester 1, 2016. 
 * 
 */
package asgn2Simulators;

/**
 * Specialisation of the {@link aasgn2Passengers.Passenger} class for the Log. 
 * 
 * @author hogan
 * @author priyanka patel & Conrad Bell
 */

import asgn2Aircraft.AircraftException;
import asgn2Passengers.Passenger;
import asgn2Passengers.PassengerException;

public class Log extends java.lang.Object
{
	public static final boolean SAVE_STATUS = false;
	
	/**
	 * Constructor sets Log info and the all logging passenger. 
	 * 
	 
	 * @throws IOException if input OR output value make some error 
	 */
	public Log() throws java.io.IOException
    {
		
    }
	
	/**
	 * Method to set passenger message from the Passenger 
	 * seat prior to entry to this method.   
	 *
	 * @param p <code>Passenger</code> to be set into the aircraft 
	 * @param source <code>String</code> source details 
	 * @param target <code>String</code> target of our passenger view 
	 
	 * @return message of set passenger
	 */
	public static java.lang.String setPassengerMsg(Passenger p,java.lang.String source,java.lang.String target)
	{
		return "";
	}
	
	/**
	 * Method to set passenger upgrade message to the Passenger 
	 * seat prior to entry to this method.   
	 *
	 * @param p <code>Passenger</code> to be set into the aircraft 
	 * 
	 
	 * @return message of set passenger upgrade message
	 */
	public static java.lang.String setUpgradeMsg(Passenger p)
	{
		return "";
	}
	
	/**
	 * Method to finalise all booking details 
	 * seat prior to entry to this method.   
	 *
	 * @param sim <code>Simulator</code> to be finalise passenger using Simulator class
	 * @throws IOException if input OR output value make some error 
	 
	 */
	public void finalise(Simulator sim) throws java.io.IOException
	{
		
	}
	
	/**
	 * Method to finalise all booking details 
	 * seat prior to entry to this method.   
	 *
	 * @param sim <code>Simulator</code> to be initial passenger using Simulator class
	 * @throws IOException if input OR output value make some error 
	 * @throw SimulationExceptino link {asgn2Simulator.SimulationException}
	 */
	public void initialEntry(Simulator sim) throws java.io.IOException, SimulationException
	{
		
	}
	
	/**
	 * Method to logEntry all booking details 
	 * seat prior to entry to this method.   
	 *
	 * @param time <code>int</code> to be initial passenger using Simulator class
	 * @param sim <code>Simulator</code> to be initial passenger using Simulator class
	 * @throws IOException if input OR output value make some error 
	 * @throw SimulationExceptino link {asgn2Simulator.SimulationException}
	 */
	public void logEntry(int time, Simulator sim) throws java.io.IOException, SimulationException
    {
		
    }
	
	/**
	 * Method to logQREntries all booking details 
	 * seat prior to entry to this method.   
	 *
	 * @param time <code>int</code> to be initial passenger using Simulator class
	 * @param sim <code>Simulator</code> to be initial passenger using Simulator class
	 * @throws IOException if input OR output value make some error 
	 * 
	 * */
	public void logQREntries(int time,Simulator sim) throws java.io.IOException
	{
		
	}
	
	/**
	 * Method to logFlightEntries all booking details 
	 * seat prior to entry to this method.   
	 *
	 * @param time <code>int</code> to be initial passenger using Simulator class
	 * @param sim <code>Simulator</code> to be initial passenger using Simulator class
	 * @throws IOException if input OR output value make some error 
	 * @throw SimulationExceptino link {asgn2Simulator.SimulationException}
	 */
	public void logFlightEntries(int time,Simulator sim) throws java.io.IOException,SimulationException  
    {
		
    }
}
