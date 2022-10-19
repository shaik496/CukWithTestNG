package springframework.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SterioRunner {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sterioConfig.xml");
        Student test = applicationContext.getBean("ob", Student.class);
        System.out.println(test);
        System.out.println(test.getAddress());
        System.out.println(test.hashCode());
        Student test2 = applicationContext.getBean("ob", Student.class);
        System.out.println(test2.hashCode()); //  by default its a single tone scope

    }
}
