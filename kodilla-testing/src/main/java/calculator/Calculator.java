package calculator;

public class Calculator
{
    double sum;
    double difference;

    public double add(double a, double b)
    {
        sum = a + b;
        return sum;
    }

    public double subtract(double a, double b)
    {
        difference = a -b;
        return difference;
    }
}
