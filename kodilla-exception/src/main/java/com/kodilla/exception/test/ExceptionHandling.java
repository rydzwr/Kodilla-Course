package com.kodilla.exception.test;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        SecondChallenge secondChallenge = new SecondChallenge();

        try
        {
            String result = secondChallenge.probablyIWillThrowException(2.1, 1.5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Done!");
        }
    }
}
