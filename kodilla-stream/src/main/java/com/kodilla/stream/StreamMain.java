package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain
{
    public static void main(String[] args)
    {
        String text = "Hello World!";
        String x = "X";
        String ABC = "ABC";
        String stars = "****";

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println();

        PoemDecorator addX = () -> System.out.println(x + " " + text + " " + x);
        poemBeautifier.beautify(addX);

        System.out.println();

        PoemDecorator addABC = () -> System.out.println(ABC + " " + text + " " + ABC);
        poemBeautifier.beautify(addABC);

        System.out.println();

        PoemDecorator toUpperCase = () -> System.out.println(text.toUpperCase());
        poemBeautifier.beautify(toUpperCase);

        System.out.println();

        PoemDecorator addStars = () -> System.out.println(stars + " " + text + " " + stars);
        poemBeautifier.beautify(addStars);
    }
}