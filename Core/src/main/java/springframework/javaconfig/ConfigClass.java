package springframework.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springframework.lifecycle.Samosa;

@Configuration
//@ComponentScan(basePackages = {"springframework.javaconfig"})
public class ConfigClass {

    @Bean(name="getSomosa")
    public Somosa getSamosa(){
        return new Somosa();
    }

    @Bean
    public Student getStudent(){
        Student student= new Student(getSamosa());
        return student;
    }
}
