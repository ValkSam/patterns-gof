/**
 * Created by ValkSam on 22.10.2016.
 */
public class ConcreteBuilder implements Builder {

    @Override
    public void build() {
        System.out.println("Комната из бетона");
    }
}
