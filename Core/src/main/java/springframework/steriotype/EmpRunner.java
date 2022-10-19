package springframework.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springframework.steriotype.Employee;

public class EmpRunner {

    public static void main(String[] args) {
        ApplicationContext clasPath=   new ClassPathXmlApplicationContext("colConfig.xml");

        Employee emp=(Employee)clasPath.getBean("emp");
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        System.out.println(emp.getPhones());
        System.out.println(emp.getCourse());



    }
}
