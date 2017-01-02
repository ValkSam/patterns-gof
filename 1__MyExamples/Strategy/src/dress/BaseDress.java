package dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class BaseDress implements Dress {
    private String dressName = "Трусы, Майка, Носки";

    @Override
    public String getDressName() {
        return dressName;
    }

}
