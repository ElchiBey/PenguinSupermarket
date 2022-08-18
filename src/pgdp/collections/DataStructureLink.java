package pgdp.collections;

public class DataStructureLink<T> {

    private DataStructureConnector<T> firstConn, secondConn;

    public DataStructureLink(DataStructureConnector<T> firstConn, DataStructureConnector<T> secondConn) {
        this.firstConn = firstConn;
        this.secondConn = secondConn;
    }

    public boolean moveNextFromAToB() {
        if (firstConn.hasNextElement()) {
            secondConn.addElement(firstConn.removeNextElement());
            return true;
        } else return false;
    }

    public void moveAllFromAToB() {
        while (firstConn.hasNextElement()) {
            secondConn.addElement(firstConn.removeNextElement());
        }
    }
}
