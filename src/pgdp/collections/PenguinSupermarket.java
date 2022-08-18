package pgdp.collections;

public class PenguinSupermarket {

    private final Checkout[] checkouts;

    public PenguinSupermarket(int amount) {
        if (amount < 0) ExceptionUtil.illegalArgument("must be greater than 0");
        checkouts = new Checkout[amount];
        for (int i = 0; i < amount; i++) {
            checkouts[i] = new Checkout();
        }
    }

    public Checkout[] getCheckouts() {
        return checkouts;
    }

    public Checkout[] getCheckoutWithSmallestQueue() {
        int result = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < checkouts.length; i++) {
            if (checkouts[i].queueLength() <= result)
                j = i;
            result = checkouts[i].queueLength();
        }
        return new Checkout[]{checkouts[j]};
    }

    public void closeCheckout(int index) {
        if (checkouts.length == 1) ExceptionUtil.illegalArgument("magazia jer ar daketila, sad midixar?!");
        if (checkouts[index] == null) ExceptionUtil.illegalArgument("egeti salaro ar gvaaqvs");

        QueueConnector<PenguinCustomer> sameQueue = new QueueConnector<>(checkouts[index].getQueue());
        QueueConnector<PenguinCustomer> emptyQueue = new QueueConnector<>(null);
        DataStructureLink<PenguinCustomer> data = new DataStructureLink<>(sameQueue, emptyQueue);
        data.moveAllFromAToB();
        Queue<PenguinCustomer> reversedQueue = (Queue<PenguinCustomer>) data;
        reversedQueue.dequeue().goToCheckout(this);

        checkouts[index] = null;

    }


    public void serveCustomers() {
        for (Checkout checkout : checkouts) {
            checkout.serveNextCustomer();
        }
//        for(int i = 0; i < checkouts.length; i++) {
//            checkouts[i].serveNextCustomer();
//        }
    }
}
