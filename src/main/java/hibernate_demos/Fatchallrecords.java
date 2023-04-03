package hibernate_demos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Fatchallrecords {
	public static void main(String[] args)
	{
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	Query<users> q=s.createQuery("select u from users u");
		List<users> users=q.getResultList();
		for(users u:users) {
			System.out.println("ID: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Age: "+u.getAge());
			System.out.println("Mails: "+u.getMail());
			System.out.println("phone number: "+u.getPno());
			System.out.println("------------------------");
		}
		
	}


}
