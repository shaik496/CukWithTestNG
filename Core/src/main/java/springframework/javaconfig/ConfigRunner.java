package springframework.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigRunner {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);
        Student studnet = context.getBean("getStudent", Student.class);
        System.out.println(studnet);
        studnet.setName("Shaik");
        System.out.println(studnet.getName());


    }
}
