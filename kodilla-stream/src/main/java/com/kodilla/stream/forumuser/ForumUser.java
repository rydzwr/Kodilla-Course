package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser
{
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int userPostsCount;

    public ForumUser(int userID, String userName, char userSex, LocalDate userDateOfBirth, int userPostsCount)
    {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.userPostsCount = userPostsCount;
    }

    public int getUserID()
    {
        return userID;
    }

    public String getUserName()
    {
        return userName;
    }

    public char getUserSex()
    {
        return userSex;
    }

    public LocalDate getUserDateOfBirth()
    {
        return userDateOfBirth;
    }

    //public int setUserYearOfBirth()
    //{
        //int userYearOfBirth = getUserDateOfBirth().getYear();
        //return userYearOfBirth;
    //}

    public int getUserPostsCount()
    {
        return userPostsCount;
    }

    @Override
    public String toString()
    {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userPostsCount=" + userPostsCount +
                '}';
    }
}
