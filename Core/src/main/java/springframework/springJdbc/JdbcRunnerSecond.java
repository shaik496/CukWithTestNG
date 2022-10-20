package springframework.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcRunnerSecond {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao dat = applicationContext.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setId(111);
        student.setName("Bsbe");
        student.setAddress("kk");
        int result = dat.insert(student);
        System.out.println("Records inserted " + result);
    }
}
