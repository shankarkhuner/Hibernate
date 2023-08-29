package userMain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import user.NonVeg;
import user.Veg;

public class TestSwiggyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		NonVeg nv = new NonVeg(158,"non-veg",325.25,"fish_thali","chiken_biriyani");
		Veg veg = new Veg(121,"veg",154,"veg_Thali","Dal_tadka");
		em.persist(veg);
		em.persist(nv);
		et.commit();
		

	}

}
