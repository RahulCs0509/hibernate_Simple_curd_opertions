package hibernate_demos;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ID to delete the record");
		int id=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
	    users u=s.find(users.class,id);
	if(u!=null) {
			s.delete(u);
			Transaction t=s.beginTransaction();
			t.commit();
			System.out.println("user with ID: "+id+" deleted");
		}else {
			System.out.println("Entered ID is invalid");
		}
	}

}
