package foo.bar.observer;

public class SmsSubscriber implements Subscriber {

    @Override
    public void update(NewsPublisher newsPublisher) {

        System.out.println("Sms subscriber: " + newsPublisher.getLatestNews());

    }

}
