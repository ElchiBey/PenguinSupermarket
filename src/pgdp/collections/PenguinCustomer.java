package pgdp.collections;

public class PenguinCustomer {

    private String name;
    private int cash;
    private Stack<FishyProduct> product;

    public PenguinCustomer(String name, int cash, Stack<FishyProduct> product) {
        this.name = name;
        this.cash = cash;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public Stack<FishyProduct> getProduct() {
        return product;
    }

    public void addProductToBasket(FishyProduct newProduct){
        product.push(newProduct);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> allProducts) {
        while(!product.isEmpty())
        allProducts.enqueue(product.pop());
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> allProducts){
        
    }

    @Override
    public String toString() {
        return "PenguinCustomer{" +
                "name='" + name + '\'' +
                ", cash=" + cash +
                ", product=" + product +
                '}';
    }
}
