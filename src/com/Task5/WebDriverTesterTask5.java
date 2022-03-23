package com.Task5;

public class WebDriverTesterTask5 {
    public static void main(String[] args) {
        RemoteWebDriver [] browsers= {new ChromeDriver(), new FirefoxDriver(),new SafariDriver()};
        //RemoteWebDriver [] browsers=new RemoteWebDriver[]
        for(RemoteWebDriver browser: browsers){
            System.out.println(browser.getTitle());
            browser.navigate();
            browser.open();
            browser.close();
            }

        }
    }

