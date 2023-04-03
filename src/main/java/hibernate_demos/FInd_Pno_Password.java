package hibernate_demos;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FInd_Pno_Password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Phone number");
		long pno=sc.nextLong();
		System.out.println("Enter your password");
		String password=sc.next();
		String hql="select u from users u where u.pno=?1 and u.password=?2";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<users> q=s.createQuery(hql);
		q.setParameter(1, pno);
		q.setParameter(2, password);
		List<users> users=q.getResultList();
		if(users.size()>0) {
			users u=users.get(0);
       System.out.println("welcome Mr. "+u.getName()+" Your login is Successfull");
			System.out.println("ID "+u.getId());
			System.out.println("Age "+u.getAge());
			System.out.println("phone number: "+u.getPno());
		}
		else {
		System.out.println("Invalid phone number (or) password");	
		}
	}


}
