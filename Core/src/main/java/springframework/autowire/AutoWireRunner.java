package springframework.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireRunner {


    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Result rest = abstractApplicationContext.getBean("result", Result.class);
        System.out.println(rest);
    }
}
