package com.elporfirio;

public class Loops {

    public doWhile(){
        int val = 5;
        int factorial = 1;

        while(val > 1) {
            factorial *= val;
            val -= 1;
        }

        System.out.println(factorial);
    }

    public doWhileShort(){
        int val = 5;
        int factorial = 1;

        while(val > 1)
            factorial *= val--;

        System.out.println(factorial);
    }

    public doDoWhile(){
        int val = 5;
        do {
            System.out.println(val);
            System.out.println(" * 2 = ");
            val *= 2;
            System.out.println(val);
        } while (val < 100);
    }

    public doFor(){
        for(int val = 1; val < 100; val *= 2)
            System.out.println(val);
    }

    public void doArrays(){
        // Modo Short
        // float[] values = { 10.0f, 20.0f, 15.0f };
        float[] values = new float[3];
        values[0] = 10.0f;
        values[1] = 20.0f;
        values[2] = 15.0f;

        float sum = 0.0f;

        for(int i = 0; i < values.length; i++)
            sum += values[i];

        System.out.println(sum);
    }

    public void doForEach(){
        float[] values = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;

        for(float currentValue: values)
            sum += currentValue;
    }

    public void doForSwitch(){
        int value = 10;
        switch (value % 2){
            case 0:
                System.out.println(" is Even");
                break;
            case 1:
                System.out.println(" is odd");
                break;
            default:
                System.out.println(" its broke");
                break;
        }
    }
}
