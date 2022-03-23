package com.Task5;

public class ChromeDriver implements RemoteWebDriver{

    @Override
    public void navigate() {
        System.out.println("Chrome Navigate method implemented");
    }

    @Override
    public void open() {
        System.out.println("Chrome Open method implemented");
    }

    @Override
    public void close() {
        System.out.println("Chrome Close method implemented");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }
}
