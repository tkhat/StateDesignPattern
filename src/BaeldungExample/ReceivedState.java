package BaeldungExample;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("this Package is Already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {

    }
}
