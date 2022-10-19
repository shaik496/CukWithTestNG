package springframework.steriotype;


import org.checkerframework.common.value.qual.EnumVal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
@Scope("prototype")
public class Student {


    @Value("Shaik Default")
    private String name;


    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Value("#{temp}")
    private List<String> address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Value("Hyderabad")
    private String city;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
