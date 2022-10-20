package springframework.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import springframework.orm.entity.Student;

import javax.transaction.Transactional;


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


}
