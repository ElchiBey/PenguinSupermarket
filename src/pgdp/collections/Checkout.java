package pgdp.collections;

public class Checkout {

    private PenguinCustomer queue;
    private Queue<FishyProduct> bandBeforeCashier;
    private Queue<FishyProduct> bandAfterCashier;

    public Checkout() {
    }

    public Queue<FishyProduct> getBandAfterCashier() {
        return bandAfterCashier;
    }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return bandBeforeCashier;
    }

    public PenguinCustomer getQueue() {
        return queue;
    }

    public int queueLength(){
        return queue.toString().length();
    }

    public void serveNextCustomer(){
        queue.placeAllProductsOnBand(bandBeforeCashier);
        queue.placeAllProductsOnBand(bandAfterCashier);
        queue.pay(queue.getMoney());
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "queue=" + queue +
                ", bandBeforeCashier=" + bandBeforeCashier +
                ", bandAfterCashier=" + bandAfterCashier +
                '}';
    }
}
