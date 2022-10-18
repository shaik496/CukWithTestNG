package springframework.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerTest {

    public static void main(String[] args) {

        AbstractApplicationContext assp= new ClassPathXmlApplicationContext("lifeConfig.xml");

    Example s= (Example) assp.getBean("example");
        System.out.println(s);
    }
}
