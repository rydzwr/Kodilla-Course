package com.kodilla.testing.forum.statistics;


public class StatisticsCalculator
{
    Statistics statistics;
    public StatisticsCalculator(Statistics statistics)
    {
        this.statistics = statistics;
    }

    double postsAveragePerUser;
    double commentsAveragePerUser;
    double commentsAveragePerPost;

    void calculateAdvStatistics()
    {
        double usersQuantity = statistics.usersNames().size();
        double postQuantity = statistics.postsCount();
        double commentsQuantity = statistics.commentsCount();

        if (usersQuantity == 0)
        {
            throw new IllegalArgumentException("Zero Users!");
        }
        else if (postQuantity == 0)
        {
            throw new IllegalArgumentException("Zero Posts!");
        }
        else if (commentsQuantity == 0)
        {
            throw new IllegalArgumentException("Zero Comments!");
        }


        postsAveragePerUser = postQuantity / usersQuantity;
        commentsAveragePerUser = commentsQuantity / usersQuantity;
        commentsAveragePerPost = commentsQuantity / postQuantity;
    }

    void showStatistics()
    {
        double usersQuantity = statistics.usersNames().size();
        double postQuantity = statistics.postsCount();
        double commentsQuantity = statistics.commentsCount();

        System.out.println("Users Quantity: " + usersQuantity);
        System.out.println("Posts Quantity: " + postQuantity);
        System.out.println("Comments Quantity: " + commentsQuantity);

        System.out.println("Posts Average Per User: " + postsAveragePerUser);
        System.out.println("Comments Average Per User: " + commentsAveragePerUser);
        System.out.println("Comments Average Per Post: " + commentsAveragePerPost);
    }
}
