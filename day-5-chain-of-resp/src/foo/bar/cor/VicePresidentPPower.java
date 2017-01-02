package foo.bar.cor;

public class VicePresidentPPower extends PurchasePower {

    private final double ALLOWABLE = 40 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE)
            System.out.println("VicePresident will approve $"
                    + request.getAmount());
        else if (successor != null)
            successor.processRequest(request);
    }
}
