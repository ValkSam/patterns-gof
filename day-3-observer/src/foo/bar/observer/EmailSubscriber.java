package foo.bar.observer;

public class EmailSubscriber implements Subscriber {

    @Override
    public void update(NewsPublisher newsPublisher) {

        System.out.println("E-mail subscriber: "
                + newsPublisher.getLatestNews());

    }

}
