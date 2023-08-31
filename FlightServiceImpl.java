package dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Service.FlightService;
import user.Flight;
import user.Schedule;
import utility.JpaUtil;

//import model.Flight;
//import model.Schedule;
//import service.FlightService;
//import Utility.JpaUtil;

public class FlightServiceImpl implements FlightService {

	
	public Flight searchFlightById(int id) {
        
		EntityManager em=JpaUtil.getEntitymanager();
		 
		if(em!=null)
	{
		
	String qStr = "SELECT flight FROM Flight flight left join Schedule s "
				+ "ON s.scheduleId=flight.schedule WHERE flight.flightNumber=:p1";
		
	//Query query=	em.createQuery(qStr);
	TypedQuery<Flight> query = em.createQuery(qStr,Flight.class);
		query.setParameter("p1", id);
		
		List<Flight> flightList = query.getResultList();
		return flightList.get(0);
	}
	em.close();
	return null;
	}
	public List<Flight> getAllFlightWithSchedule() {

		EntityManager em=JpaUtil.getEntitymanager();
		if(em!=null)
		{
			List<Flight> list=new ArrayList<Flight>();
			//TypedQuery<Schedule> query=em.createQuery("select s from Schedule s",Schedule.class);
			Query query=em.createQuery("select s from Schedule s");
	List<Schedule> listOfSchedule=(List<Schedule>)query.getResultList();
	for(Schedule s:listOfSchedule)
	{
		Set<Flight> flight=s.getFlights();
		for(Flight f: flight)
		{
			list.add(f);
		}				
	}
	return list;
		}
		em.close();
		return null;		
	}

	//pass schedule id as parameter
	public void removeFlight(int id) {
		EntityManager em=JpaUtil.getEntitymanager();		
		em.getTransaction().begin();
		//delete from Schedule_details where s.sid=:si
		String qStr="delete from Schedule s where s.scheduleId=:sId";
		Query query = em.createQuery(qStr);
	      query.setParameter("sId", id);
	      int rowsDeleted = query.executeUpdate();
	      System.out.println("entities deleted: " + rowsDeleted);
	      em.getTransaction().commit();
	      em.close();
	}

	public int updateFlight(int id) {

		//String qStr="update Schedule set s.s where s.scheduleId=:sId";
		EntityManager em=JpaUtil.getEntitymanager();
	Query updateQuery=	  em.createNamedQuery("queryForUpdate");
		updateQuery.setParameter("par1","Indigo");
		updateQuery.setParameter("par2", id);
	int status=	updateQuery.executeUpdate();

		return status;
	}
	public Flight getFlight(int flightNumber)
	{
		EntityManager em=JpaUtil.getEntitymanager();

		Query namedQuery =em .createNamedQuery("flightFlightDetails");
	    namedQuery.setParameter("p1",flightNumber);
	    
	   
	Flight f= (Flight) namedQuery.getSingleResult();
	    return f;	
	    }

	public Flight serviceFlightBiId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

