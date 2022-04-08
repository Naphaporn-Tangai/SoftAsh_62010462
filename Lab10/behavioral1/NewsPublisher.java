package edu.parinya.softarchdesign.behavioral;

import java.util.ArrayList;

public class NewsPublisher {

    private String Name;
    private News mainNew;
    private ArrayList<NewsSubscriber> subScriber = new ArrayList<NewsSubscriber>();

    public NewsPublisher(){
    }


    public void subscribe(NewsSubscriber Sub) {
        subScriber.add(Sub);
    }

    public void unsubscribe(NewsSubscriber Sub) {
        subScriber.remove(Sub);
    }

    public void notifySubs(String content) {
        System.out.println("Published "+mainNew.getTopic()+" news to subscribers");
        for (NewsSubscriber s : subScriber) {
            s.update(content);
        }
    }

    public void publish(News newState){
        mainNew = newState;
        notifySubs(mainNew.getContent());
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}
