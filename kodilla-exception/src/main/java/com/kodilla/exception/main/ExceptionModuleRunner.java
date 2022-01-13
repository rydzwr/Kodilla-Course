package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner
{

    public static void main(String[] args)
    {
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();

        try
        {
            fileReader.readFile();
        }
        catch (IOException e)
        {
            System.out.println("Problem while reading a file!" + e.getMessage());
        }
        /*
        catch (SecurityException e)
        {
            System.out.println("Access Denied" + e.getMessage());
        }

         */
    }
}