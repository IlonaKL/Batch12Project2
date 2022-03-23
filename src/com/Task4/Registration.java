package com.Task4;

import java.util.Locale;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if(!email.endsWith("yahoo.com")){
            System.out.println("Invalid email. Enter an email that ends at yahoo.com");
        }
        else{
            this.email = email;
        }
    }

    public void setUseName(String userName){
        if (userName.isEmpty() || userName.length()<6){
            System.out.println("Valid userName cannot be empty and should be of length larger than 6 characters");
        }
        else {
            this.userName = userName;
        }
    }

    public void setPassword(String password){
        password=password.toLowerCase(Locale.ROOT);
        userName=userName.toLowerCase(Locale.ROOT);
        if (password.isEmpty() || password.length()<6 || password.contains(userName)){
            System.out.println("Valid password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.");
        }
        else {
            this.password=password;
        }
    }

    public String getEmail(){
            return email;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    /*public void register(){
        if (!email.isEmpty() && !userName.isEmpty() && !password.isEmpty())
            System.out.println("Successfully registered");
        else {
            System.out.println("Error registering");
        }
    }*/

    public static void main(String[] args) {
        Registration me = new Registration();
        me.setEmail("khbl.kg@gmal.com");
        me.setUseName("ilonaKeenan");
        me.setPassword("ilonakeenan1234");

        System.out.println("Email is: "+me.getEmail());
        System.out.println("Username is: "+me.getUserName());
        System.out.println("Password is: "+me.getPassword());

    }
}


