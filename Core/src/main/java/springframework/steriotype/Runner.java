package springframework.steriotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springframework.steriotype.A;

public class Runner {


    public static void main(String[] args) {

        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("objConfig.xml");

        A student = (A)  appContext.getBean("Aref");

        System.out.println(student.getX());
        System.out.println(student.getOb().getY());

        System.out.println(student);


    }
}
