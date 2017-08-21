import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("appCTX.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		//int status=dao.saveEmployee(new Employee(102,"Amit",35000));
		//System.out.println(status);
		
		System.out.println(dao.getCountEMP());
	
	}

}
