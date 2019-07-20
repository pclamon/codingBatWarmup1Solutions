package com.company;

public class Main {

    public static void main(String[] args)
    {

    }

    public boolean sleepIn(boolean weekday, boolean vacation)
    {
        if (!weekday || vacation)
        {
            return true;
        }

        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        boolean monkeyTrouble = false;

        if ((aSmile && bSmile) || (!aSmile && !bSmile))
        {
            monkeyTrouble = true;
        }

        return monkeyTrouble;
    }

    public int sumDouble(int a, int b)
    {
        int sumDouble = 0;

        if (a == b)
        {
            sumDouble = (a + b) * 2;
        }
        else
        {
            sumDouble = a + b;
        }

        return sumDouble;
    }

    public int diff21(int n)
    {
        if (n <= 21)
        {
            return 21 - n;
        }
        else
        {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour)
    {
        boolean parrotTrouble = false;

        if (talking && (hour < 7 || hour > 20))
        {
            parrotTrouble = true;
        }

        return parrotTrouble;
    }

    public boolean makes10(int a, int b)
    {
        boolean makes10 = false;

        if (a == 10 || b == 10)
        {
            makes10 = true;
        }
        else if (a + b == 10)
        {
            makes10 = true;
        }

        return makes10;
    }

    public boolean nearHundred(int n)
    {
        boolean nearHundred = false;

        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210))
        {
            nearHundred = true;
        }

        return nearHundred;
    }

    public boolean posNeg(int a, int b, boolean negative)
    {
        boolean posNeg = false;

        if (negative)
        {
            if (a < 0 && b < 0)
            {
                posNeg = true;
            }
        }
        else
        {
            if ((a < 0 && b >= 0) || (a >= 0 && b < 0))
            {
                posNeg = true;
            }
        }

        return posNeg;
    }

    public String notString(String str)
    {
        String notString = "not " + str;

        if (str.length() >= 3 && str.substring(0, 3).equals("not"))
        {
            notString = str;
        }

        return notString;
    }
}
