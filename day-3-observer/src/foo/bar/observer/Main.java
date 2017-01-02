package foo.bar.observer;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        NewsPublisher publisher = new BusinessNewsPublisher();
        Subscriber subscriber1 = new EmailSubscriber();
        Subscriber subscriber2 = new SmsSubscriber();

        publisher.attache(subscriber1);
        publisher.attache(subscriber2);

        publisher.setLatestNews("Hello, Subscriber(Observer)!!!");

        System.out.println("Detaching subsriber # 2...");
        publisher.detach(subscriber2);

        publisher.setLatestNews("Hi, All! Who listens to me?");

    }

}
