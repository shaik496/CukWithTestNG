package springframework.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class StandAloneRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("standAlone.xml");
        Person p = (Person) applicationContext.getBean("person2");
        System.out.println(p);
        System.out.println(p.getFeeStructure().getClass().getName());
        System.out.println(p.getProperties().getClass().getName());
    }
}
