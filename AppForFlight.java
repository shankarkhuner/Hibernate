package userMain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import dao.FlightServiceImpl;
import user.Flight;
import user.Schedule;
import utility.JpaUtil;

public class AppForFlight {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntitymanager();
		Schedule schedule = new Schedule();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter schedule Id");
		int id =Integer.parseInt(scanner.nextLine());
		System.out.println("Enter date in yyy-mm-dd formate");
		String scheduleDate=scanner.nextLine();
		
		LocalDate schDate = LocalDate.parse(scheduleDate);
		System.out.println("Enter Schedule Time hh:mm:ss format");
		String scheduleTime  = scanner.nextLine();
		LocalTime schTime = LocalTime.parse(scheduleTime);
		
		
		schedule.setScheduleId(id);
		schedule.setScheduleDate(schDate);
		schedule.setScheduleTime(schTime);
		Flight flight1 = new Flight();
		flight1.setFlightNumber(181);
		flight1.setFlightName("AirAsia");
		flight1.setSchedule(schedule);
		
		Flight flight2 = new Flight();
		flight2.setFlightNumber(145);
		flight2.setFlightName("SpaceJet");
		flight2.setSchedule(schedule);
		
		schedule.addFlight(flight1);
		schedule.addFlight(flight2);
		em.getTransaction().begin();
		em.persist(schedule);
		
		FlightServiceImpl impl = new FlightServiceImpl();
		
		List<Flight> flight = impl.getAllFlightWithSchedule();
		System.out.println(flight);
		
		em.getTransaction().commit();
		
		//FlightServiceImpl impl = new FlightServiceImpl();
	
		
		

	}

}
