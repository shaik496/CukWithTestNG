package springframework.javaconfig;


import org.springframework.stereotype.Component;
import springframework.lifecycle.Samosa;


public class Student {

    public Student(Somosa samosa) {
        this.somosa= samosa;
    }

    private Somosa somosa;

    private String name ;
    private String addresss;

    public String getName() {
        this.somosa.diplay();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }
}
