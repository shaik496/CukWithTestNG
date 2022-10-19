package springframework.springJdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentImpl implements StudentDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        //insert query
        String query = "insert into student(id,name,address) values(?,?,?)";
       int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
        return r;
    }

    @Override
    public int change(Student student) {
        String query ="update student set name =? , address=? where  id= ?";
       int r= this.jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
        return r;
    }

    @Override
    public int delete(Student studet) {
        String query= "delete from student where id= ?";
        int r= this.jdbcTemplate.update(query,studet.getId());
        return 0;
    }

    @Override
    public Student getStudent(int studentID) {
        String query= "select *from student where id=?";
        RowMapper<Student> rowMapperStudent=   new RowMapperImpl();
       Student studnet= this.jdbcTemplate.queryForObject(query,rowMapperStudent, studentID);
        return studnet;
    }

}
