package hibernate_demos;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateRecord {
	public static void main(String[] args) {
		users u=new users();
		u.setId(2);
		u.setName("Rujala Rai");
		u.setMail("rujalarai1405@gmail.com");
		u.setPassword("Rujala@1405");
		u.setPno(7024401466l);
		u.setAge(21);
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		s.update(u);
		t.commit();
	}

}
