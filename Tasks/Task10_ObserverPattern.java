import java.util.ArrayList;
import java.util.List;


interface NewsSubject {
    void registerSubscriber(NewsSubscriber subscriber);
    void removeSubscriber(NewsSubscriber subscriber);
    void notifySubscribers(String news);
}


class NewsAgency implements NewsSubject {
    private List<NewsSubscriber> subscribers;
    public NewsAgency() {
        subscribers = new ArrayList<>();
    }

    public void publishNews(String news) {
        notifySubscribers(news);
    }

    @Override
    public void registerSubscriber(NewsSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(NewsSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.receiveNews(news);
        }
    }
}


interface NewsSubscriber {
    void receiveNews(String news);
}


class NewspaperSubscriber implements NewsSubscriber {
    private String subscriberName;

    public NewspaperSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void receiveNews(String news) {
        System.out.println(subscriberName + " received the latest news: " + news);
    }
}

public class Task10_ObserverPattern {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewspaperSubscriber subscriber1 = new NewspaperSubscriber("Subscriber 1");
        NewspaperSubscriber subscriber2 = new NewspaperSubscriber("Subscriber 2");

        newsAgency.registerSubscriber(subscriber1);
        newsAgency.registerSubscriber(subscriber2);

        newsAgency.publishNews("Breaking: New legislation passed!");
        newsAgency.publishNews("Weather forecast for the week.");

        newsAgency.removeSubscriber(subscriber1);

        newsAgency.publishNews("Local event coverage.");
    }
}

