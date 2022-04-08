package edu.parinya.softarchdesign.behavioral;


public class NewsReader implements NewsSubscriber {
    private String NewsReader;

    public NewsReader(String name) {
        NewsReader = name;
    }

    @Override
    public void update(String detail) {
        System.out.println( NewsReader+" : "+ detail);
    }

    public String getName() {
        return NewsReader;
    }

}