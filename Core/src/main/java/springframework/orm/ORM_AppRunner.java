package springframework.orm;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springframework.orm.dao.StudentDao;
import springframework.orm.entity.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ORM_AppRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ormConfig.xml");
        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
boolean go=true;
        System.out.println("PRESS 1 TO ADD  NEW STUDENT :");
        System.out.println("PRESS 2 TO DISPLAY  ALL STUDENT :");
        System.out.println("PRESS 3 TO DIPLAY  SINGLE STUDENT :");
        System.out.println("PRESS 4 TO DELETE  STUDENT :");
        while (go) {

            try {

                int input = Integer.parseInt(bufferedReader.readLine());

                switch (input) {
                    case 1:
                        Student student= new Student();
                        System.out.println("Enter User id");
                    int uid=    Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter User Name");
                     String name=   bufferedReader.readLine();
                        System.out.println("Enter Addres");
                        String address=   bufferedReader.readLine();
                        student.setSid(uid);
                        student.setName(name);
                        student.setAddress(address);
                      int r=  studentDao.insert(student);
                        System.out.println(r + "Student inserted");
                        break;
                    case 2:
                        // display all students
                    List<Student> allstudents= studentDao.getAllStudents();
                        System.out.println(allstudents);
                        for (Student st:
                                allstudents ) {
                            System.out.println("ID "+st.getSid());
                            System.out.println("Name "+st.getName());
                            System.out.println("Address "+st.getName());
                        }
                    break;
                    case 3:
                        go=false;
                        break;

                }

            } catch (Exception exp) {

                System.out.println("INVALID INPUT TRY WITH OTHERONE");
                System.out.println(exp.getMessage());

            }
        }

    }
}
