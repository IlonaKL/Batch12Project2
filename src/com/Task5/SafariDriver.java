package com.Task5;

public class SafariDriver implements RemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Safari navigate method implemented");
    }

    @Override
    public void open() {
        System.out.println("Safari open method implemented");
    }

    @Override
    public void close() {
        System.out.println("Safari close method implemented");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }
}
