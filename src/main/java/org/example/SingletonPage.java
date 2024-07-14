package org.example;

public class SingletonPage {
    private static SingletonPage instance;

    public SingletonPage() {

    }
    public static SingletonPage getInstance() {
        if (instance == null) {
            instance = new SingletonPage();
        }
        return instance;
    }

    public void showMessage(String e) {
        System.out.println(e);
    }
}
