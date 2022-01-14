package com.kodilla.good.patterns.shop;

public class User
{
    private int userID;
    private String userName;
    private String userEmail;

    public User(int userID, String userName, String email)
    {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public int getUserID()
    {
        return userID;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }
}