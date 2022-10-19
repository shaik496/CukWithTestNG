package springframework.autowire;

public class Sample {

    private String cbp;

    public String getCbp() {
        return cbp;
    }

    public void setCbp(String cbp) {
        this.cbp = cbp;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "cbp='" + cbp + '\'' +
                '}';
    }
}
