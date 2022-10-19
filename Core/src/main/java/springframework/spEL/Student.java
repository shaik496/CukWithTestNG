package springframework.spEL;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {


    @Value("#{20+30}")
    private int marks;

    @Value("#{2+4+6}")
    private String subject;

    public int getMarks() {
        return marks;
    }

    @Value("#{8>3}")
     private boolean isCorrect;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
