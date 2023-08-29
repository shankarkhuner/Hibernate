package userMain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import user.Admin;
import user.Customer;

public class TestUserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Admin adminObj = new Admin(108,"admin","pass@123");
		Customer customerObj = new Customer(8,"cistomer@1230","cyber@123");
		em.persist(adminObj);
		em.persist(customerObj);
		et.commit();
		
		

	}

}
