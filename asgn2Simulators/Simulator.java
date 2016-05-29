package asgn2Simulators;

import asgn2Aircraft.AircraftException;
import asgn2Aircraft.Bookings;
import asgn2Passengers.Passenger;
import asgn2Passengers.PassengerException;

public class Simulator extends java.lang.Object
{
	
	public Simulator() throws SimulationException
	{
		
	}
	public Simulator(int seed,int maxQueueSize,double meanDailyBookings,double sdDailyBookings,double firstProb,double businessProb,double premiumProb,double economyProb, double cancelProb) throws SimulationException
	{
		
	}         
	public static boolean randomSuccess(java.util.Random rng,double successProb)
	{
		return true;
	}
	public Passenger createPassenger(int bookingTime, int departureTime) throws PassengerException
	{
		return null;
	}
	public void createSchedule() throws AircraftException
    {
		
    }
	public java.lang.String finalState()
	{
		return "";
	}
	public void flyPassengers(int time)throws SimulationException,PassengerException
    {
		
    }         
	public void generateAndHandleBookings(int time) throws AircraftException,PassengerException,SimulationException
    {
		
    }     
	public int getDailyBookings()
	{
		return 0;
	}
	public Flights getFlights(int departureTime) throws SimulationException
    {
		return null;
    }
	public Bookings getFlightStatus(int time)throws SimulationException
    {
		return null;
    }
	public java.lang.String getStatus(int time)
	{
		return "";
	}
	public java.lang.String getSummary(int time,boolean flying) throws SimulationException
    {
		return "";
    }
	public int getTotalBusiness()
	{
		return 0;
	}
	public int getTotalEconomy()
	{
		return 0;
	}
	public int getTotalEmpty()
	{
		return 0;
	}
	public int getTotalFirst()
	{
		return 0;
	}
	public int getTotalFlown()
	{
		return 0;
	}
	public int getTotalPremium()
	{
		return 0;
	}
	public int numInQueue()
	{
		return 0;
	}
	public int numRefused()
	{
		return 0;
	}
	public void processNewCancellations(int time) throws SimulationException,PassengerException,AircraftException
	{
		
	}
	public void processQueue(int time) throws SimulationException,PassengerException,AircraftException
	{
		
	}
	public void processUpgrades(int time) throws SimulationException
	{
		
	}
	public boolean queueEmpty()
	{
		return true;
	}
	public boolean queueFull()
	{
		return true;
	}
	public void queuePassenger(Passenger p,int queueTime,int departureTime) throws SimulationException,PassengerException
	{
		
	}
	public void rebookCancelledPassengers(int time) throws SimulationException,PassengerException,AircraftException
	{
		
	}
	public void refuseBooking(Passenger p,int refusalTime) throws PassengerException
	{
		
	}
	public void resetStatus(int time)
	{
		
	}
	public java.lang.String toString()
	{
		return "";
	}
	public void updateTotalCounts(int time) throws SimulationException
	{
		
	}
              
                     
}
