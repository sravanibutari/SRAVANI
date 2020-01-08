
package comm.example;

public class Product implements ProductInterface{
    
    private double regularPrice;
    
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
   
    @Override
    public double computeSalePrice(){
        return 0;
    }
    @Override
    public double getRegularPrice() {
        return regularPrice;
    }
    @Override
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
}




