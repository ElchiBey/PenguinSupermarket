package pgdp.collections;

public class PenguinCustomer {

    private final String name;
    private int money;
    private final Stack<FishyProduct> products;

    public PenguinCustomer(String name, int initialMoney) {
        this.name = name;
        this.money = initialMoney;
        if(this.name==null || this.money <0) ExceptionUtil.illegalArgument("penguins cannot have debts");
        this.products = new LinkedStack<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Stack<FishyProduct> getProducts() {
        return products;
    }

    public void addProductToBasket(FishyProduct newProduct){
        products.push(newProduct);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> allProducts) {
        StackConnector<FishyProduct> produqtebi = new StackConnector<>(products);
        QueueConnector<FishyProduct> daxli = new QueueConnector<>(allProducts);
        DataStructureLink<FishyProduct> sayideli = new DataStructureLink<>(produqtebi,daxli);
        sayideli.moveAllFromAToB();
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> allProducts) {
        StackConnector<FishyProduct> produqtebi = new StackConnector<>(products);
        QueueConnector<FishyProduct> daxli = new QueueConnector<>(allProducts);
        DataStructureLink<FishyProduct> nayidi = new DataStructureLink<>(daxli,produqtebi);
        nayidi.moveAllFromAToB();
    }

    public void pay(int value) {
        if(value < 0 || money < value) ExceptionUtil.illegalArgument("penguins cannot have debts");
        money -= value;
    }

    public void goToCheckout(PenguinSupermarket checkout) {
        checkout.getCheckoutWithSmallestQueue().clone();
    }

    @Override
    public String toString() {
        return "PenguinCustomer{" +
                "name='" + name + '\'' +
                ", cash=" + money +
                ", product=" + products +
                '}';
    }
}
