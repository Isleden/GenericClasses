package Arithmetic;

public class Arithmetic<N1, N2>
{
    private N1 num1;
    private N2 num2;

    public Arithmetic(N1 num1, N2 num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add()
    {
        return ((Number) num1).doubleValue() + ((Number) num2).doubleValue();
    }

    public double subtract()
    {
        return ((Number) num1).doubleValue() - ((Number) num2).doubleValue();
    }

    public double multiply()
    {
        return ((Number) num1).doubleValue() * ((Number) num2).doubleValue();
    }

    public double divide() {
        if (((Number) num2).doubleValue() == 0)
        {
            throw new ArithmeticException("Zero");
        }
        return ((Number) num1).doubleValue() / ((Number) num2).doubleValue();
    }

    public double getMin()
    {
        double min = Math.min(((Number) num1).doubleValue(), ((Number) num2).doubleValue());
        return min;
    }

    public double getMax()
    {
        double max = Math.max(((Number) num1).doubleValue(), ((Number) num2).doubleValue());
        return max;
    }
}


