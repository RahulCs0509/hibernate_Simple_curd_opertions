package hibernate_demos;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindRecord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id and Prints the Details!");
		int id=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
//		users u=s.load(users.class, id);
//		users u=s.find(users.class, id);
		users u=s.get(users.class, id);
		System.out.println(u);
		if(u!=null) {
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getAge());
			System.out.println(u.getMail());
			System.out.println(u.getPno());
			System.out.println(u.getPassword());
		}else {
			System.out.println("Invaild Ids.");
		}
	}
}
