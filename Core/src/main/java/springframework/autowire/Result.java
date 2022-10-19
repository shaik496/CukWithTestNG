package springframework.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Result {

    @Autowired
    @Qualifier("sample")
    private Sample sample;

    public Sample getSample() {
        return sample;
    }


    public void setSample(Sample sample) {
        System.out.println("Seeting value");
        this.sample = sample;
    }


    public Result() {
        //
    }

    @Override
    public String toString() {
        return "Result{" +
                "sample=" + sample +
                '}';
    }
}
