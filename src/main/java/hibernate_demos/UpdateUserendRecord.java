package hibernate_demos;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateUserendRecord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id To Update");
		int id=sc.nextInt();
		System.out.println("Enter the Upadted Name,Age,Mail,Phone No,& Password ?");
		String name=sc.next();
		int age=sc.nextInt();
		String mail=sc.next();
		long pno=sc.nextLong();
		String password=sc.next();
		users u=new users();
		u.setId(id);
		u.setName(name);
		u.setAge(age);
		u.setMail(mail);
		u.setPno(pno);
		u.setPassword(password);
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		s.update(u);
		Transaction t=s.beginTransaction();
		t.commit();
		sc.close();
	}

}
