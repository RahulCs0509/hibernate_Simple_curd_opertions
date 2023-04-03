package hibernate_demos;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name to print the details");
		String name=sc.nextLine();
		String hql="select u from users u where u.name=?1";
		Session s= new Configuration().configure().buildSessionFactory().openSession();
		Query<users> q=s.createQuery(hql);
		q.setParameter(1, name);
		List<users> users=q.getResultList();
		for(users u: users) {
			System.out.println("ID: "+u.getId());
			System.out.println("Name: "+u.getName());
			System.out.println("Age: "+u.getAge());
			System.out.println("Phone: "+u.getPno());
			System.out.println("Welcome "+u.getName());
		}
		
	}


}
