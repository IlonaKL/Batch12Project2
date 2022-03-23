package com.Task5;

public class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Firefox Navigate method implemented");
    }

    @Override
    public void open() {
        System.out.println("Firefox open method implemented");
    }

    @Override
    public void close() {
        System.out.println("Firefox close method implemented");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }
}
