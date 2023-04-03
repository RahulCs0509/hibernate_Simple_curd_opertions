package hibernate_demos;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
public class Test {
	public static void main(String[] args) {
		System.out.println("Project Started!!");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("factory");
	}

}
