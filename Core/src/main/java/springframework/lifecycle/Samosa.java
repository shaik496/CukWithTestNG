package springframework.lifecycle;

public class Samosa {
    private double price;
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public Samosa(){

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }


    public void init(){
        System.out.println("This islife cycyle inint method");
    }


    public void destory(){
        System.out.println("This is destory method");
    }
}
