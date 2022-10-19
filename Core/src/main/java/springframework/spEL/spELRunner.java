package springframework.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class spELRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spEL.xml");
        Student snt = applicationContext.getBean("student", Student.class);
        System.out.println(snt.getMarks());
    }
}
