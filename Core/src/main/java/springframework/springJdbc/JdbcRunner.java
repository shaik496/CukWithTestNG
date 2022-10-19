package springframework.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbcConfig.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
        // insert new record to my table
        String query = "insert into student(id,name,address) values(?,?,?)";
        int result = jdbcTemplate.update(query, 496, "John", "Hyderabad");
        System.out.println("Number of records inserted " + result);

         jdbcTemplate.update(query, 007, "chutiya", "ramisa");
    }
}
