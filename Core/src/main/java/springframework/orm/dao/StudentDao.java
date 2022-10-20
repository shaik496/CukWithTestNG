package springframework.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import springframework.orm.entity.Student;

import javax.transaction.Transactional;
import java.util.List;


public class StudentDao {


    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    private HibernateTemplate hibernateTemplate;


    @Transactional
    public int insert(Student student) {
        //insert
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }


    public Student getStudent(int id){
      Student student=  this.hibernateTemplate.get(Student.class,id);
    return student;
    }



    public List<Student> getAllStudents(){
        List<Student> students=this.hibernateTemplate.loadAll(Student.class);
    return students;
    }


    public void deleteStudent(int studentId){
      Student std=  this.hibernateTemplate.get(Student.class,studentId);
    this.hibernateTemplate.delete(std);
    }


    public void updateStudent(Student stu){
        this.hibernateTemplate.update(stu);

    }
}
