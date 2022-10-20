package springframework.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springframework.orm.dao.StudentDao;
import springframework.orm.entity.Student;

public class ORM_Runner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ormConfig.xml");
        StudentDao dao = applicationContext.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setSid(5647);
        student.setName("chanky");
        student.setAddress("Hyderabad");
        int value = dao.insert(student);
        System.out.println("Bhai value inserted " + value);
    }
}
