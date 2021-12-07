package pgdp.collections;

public class PenguinCustomer {

    private final String name;
    private int cash;
    private final Stack<FishyProduct> product;

    public PenguinCustomer(String name, int initialMoney) {
        this.name = name;
        this.cash = initialMoney;
        if(this.name==null || this.cash<0) ExceptionUtil.illegalArgument("penguins cannot have debts");
        this.product = new LinkedStack<>();
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
        StackConnector<FishyProduct> produqtebi = new StackConnector<>(product);
        QueueConnector<FishyProduct> daxli = new QueueConnector<>(allProducts);
        DataStructureLink<FishyProduct> sayideli = new DataStructureLink<>(produqtebi,daxli);
        sayideli.moveAllFromAToB();
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> allProducts) {
        StackConnector<FishyProduct> produqtebi = new StackConnector<>(product);
        QueueConnector<FishyProduct> daxli = new QueueConnector<>(allProducts);
        DataStructureLink<FishyProduct> nayidi = new DataStructureLink<>(daxli,produqtebi);
        nayidi.moveAllFromAToB();
    }

    public void pay(int value) {
        if(value<0 || cash< value) throw new IllegalArgumentException();
        cash -= value;
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
