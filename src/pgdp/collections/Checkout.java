package pgdp.collections;

public class Checkout {

    private Queue<PenguinCustomer> queue;
    private Queue<FishyProduct> bandBeforeCashier;
    private Queue<FishyProduct> bandAfterCashier;

    public Checkout() {
        this.queue = new LinkedQueue<>();
        this.bandBeforeCashier = new LinkedQueue<>();
        this.bandAfterCashier = new LinkedQueue<>();
    }

    public Queue<FishyProduct> getBandAfterCashier() {
        return bandAfterCashier;
    }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return bandBeforeCashier;
    }

    public Queue<PenguinCustomer> getQueue() {
        return queue;
    }

    public int queueLength() {
        return queue.toString().length();
    }

    public void serveNextCustomer() {
        while (queue != null) {
            int cost = 0;
            bandBeforeCashier.enqueue((FishyProduct) queue.dequeue().getProducts());
            bandAfterCashier.enqueue(bandBeforeCashier.dequeue());
            cost += bandAfterCashier.dequeue().getPrice();
            queue.dequeue().takeAllProductsFromBand((bandAfterCashier));
            queue.dequeue().pay(cost);
            queue.dequeue();
        }
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
