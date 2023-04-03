package hibernate_demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
	public static void main(String[] args) {
		users u=new users();
		u.setName("Sai Kumar");
		u.setAge(23);
		u.setMail("saikumarkaranje73@gmail.com");
		u.setPno(9901217273l);
		u.setPassword("Sai@123");
		Configuration cfg=new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s=factory.openSession();
		s.save(u);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("User saved with Ids"+u.getId());
	}

}
