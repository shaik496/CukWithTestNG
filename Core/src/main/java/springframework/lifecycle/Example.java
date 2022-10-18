package springframework.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;

    public Example() {
        //
    }

    public String toString() {
        return "Example[subject " + subject +
                "]";
    }




    @PostConstruct
    public void start(){
        System.out.println("this is starting method");
    }
    @PreDestroy
    public void endingMethod(){
        System.out.println("This  is destory method");
    }

}
