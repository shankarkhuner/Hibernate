package userMain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import user.Developer;
import user.Manager;

public class TestEmployeeApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Developer dev = new Developer(108,"Rajveer","pune",911229L,454.00,"web","Mumbai");
		Manager manager = new Manager(1,"Ravi","Nanded",88881L,154.545,"Developer");
		em.persist(dev);
		em.persist(manager);
		et.commit();

	}

}
