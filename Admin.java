package user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin_table")
@DiscriminatorValue("admin")
public class Admin extends User{

	public Admin(int userId, String userName, String userPassword) {
		super(userId, userName, userPassword);
		// TODO Auto-generated constructor stub
	}
	

	
}
