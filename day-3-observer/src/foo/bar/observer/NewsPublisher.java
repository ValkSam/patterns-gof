package foo.bar.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsPublisher {

    private List<Subscriber> newsSubscribers = new ArrayList<Subscriber>();

    private String latestNews;

    public String getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        this.notifyObservers();
    }

    public void attache(Subscriber subscriber) {
        newsSubscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber) {
        newsSubscribers.remove(subscriber);
    }

    public void notifyObservers() {
        if (newsSubscribers != null && newsSubscribers.size() > 0) {
            for (Subscriber s : newsSubscribers) {
                s.update(this);
            }// for
        }// if
    }

}
