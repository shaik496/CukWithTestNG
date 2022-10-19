package springframework.standalone;

import java.net.InterfaceAddress;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

    private List<String> friends;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    private Map<String, Integer> feeStructure;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", properties=" + properties +
                ", feeStructure=" + feeStructure +
                '}';
    }
}
