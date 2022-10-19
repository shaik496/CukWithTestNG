package springframework.springJdbc;

import java.sql.Struct;

public interface StudentDao {
     int insert(Student student);
     int change(Student student);

     int delete(Student studet);


     Student getStudent(int studentID);



}
