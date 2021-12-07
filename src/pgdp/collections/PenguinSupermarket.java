package pgdp.collections;

public class PenguinSupermarket {

    private Checkout[] checkouts;

    public PenguinSupermarket(int amount) {
        if(amount < 0) ExceptionUtil.illegalArgument("must be greater than 0");
        checkouts = new Checkout[amount];
        for(int i=0; i<amount; i++){
            checkouts[i] = new Checkout();
        }
    }

    public Checkout[] getCheckouts() {
        return checkouts;
    }

    public Checkout[] getCheckoutWithSmallestQueue(){
        int result = Integer.MAX_VALUE;
        int j=0;
        for(int i=0; i<checkouts.length; i++){
            if(checkouts[i].queueLength() <= result)
                j=i;
            result = checkouts[i].queueLength();
        }
        return new Checkout[]{checkouts[j]};
    }

    public void closeCheckout(int index){
        if(checkouts.length==1)  ExceptionUtil.illegalArgument("magazia jer ar daketila, sad midixar?!");
        for(int i=0; i<checkouts.length; i++){
            if(checkouts[i]==null) ExceptionUtil.illegalArgument("viketebiiiit! <3");
            checkouts[i]=null;
        }
    }

    public void serveCustomers(){
        for(int i=0; i< checkouts.length; i++){
            checkouts[i].serveNextCustomer();
        }
    }
}
