public class MyFirstProgram {
    //static variable is a member of class and not method
    public static int maxRating = 10;

    public static void main(String[] args) {
        System.out.println("Hello World"); //text after the slash is treated as comment
        System.out.println("My first program in java novice");
        /*
        next is to change class name,
        we need to rename file name as well when we change class name.
        Both of them should always match
         */
        //System.out.println("This is commented code");

        int a, b; // variable declaration
        a = 10;
        b = 20; // assignment of value to variable
        int varInt = 15; //camel case & Class names are pascal case
        b = 10; //value changes of the variable
        System.out.println(varInt);
        System.out.println(a + b);

        //we cannot change the value of final variable once a value is assigned
        final int constVariable = 20;
        System.out.println(constVariable);

        //int starts with small letter i as it is primitive data type
        //String starts with capital letter S as it is class data type
        String varString = "This is the a string";
        // literal is the value which is literally written in parentheses
        System.out.format("The string value: " + varString);
        System.out.println();

        //we use ' ' for character and " " for string
        char varChar = 'a';
        System.out.println(varChar);

        //passing arguments in format or println
        int varInt1 = 100;
        System.out.println("Value of varInt: " + varInt1);
        System.out.format("The int value of %d is assigned to varInt", varInt1);
        //%d for integer & %s for string
        System.out.println();

        String name = "Henna";
        System.out.format("Good Morning, %s", name);
        System.out.println();


        //we can declare and initialize multiple variables
        int x = 5, y = 6, z = 10;

        System.out.println("Static variable is maxRating: " + maxRating);
        System.out.println(maxRating + " is the Max Rating & current rating is " + y);

    }
}


import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {
        //primitive data types
        boolean isJavaFun = true;
        byte numCredits = 4;
        char myGrade = 'A';
        short numCourses = 4;
        int age = 19;
        long tuitionPaid = 30000L; //write L at the end of long
        float gpa = 3.56f; //write f at the end of float
        double incomeEarned = 1250.50d; // write d at the end of double

        System.out.println(incomeEarned);

        //working with integers and decimals
        int varInt = 216537649;
        System.out.println(varInt);

        int newVarInt = 216_537_649;
        System.out.println(newVarInt);

        long veryLongInt = 21_216_537_649L;
        System.out.println(veryLongInt);

        float varFloat = 123.45f;
        // if we don't mention f then java will consider it double by default
        System.out.println(varFloat);

        double varDouble = 123.45;
        // if we don't mention f then java will consider it double by default
        System.out.println(varDouble);

        float expFloat = 12e3f;
        System.out.println(expFloat);

        double expDouble = 123.45e-4d;
        System.out.println(expDouble);

        byte varByte = 100;
        System.out.println(varByte);

        byte negativeByte = -100;
        System.out.println(negativeByte);

        short varShort = 31234;
        System.out.println(varShort);

        char varChar = 'R'; // char should be entered within single quotes
        System.out.println("letter is: " + varChar);

        char unicodeVal = '\u0053';
        System.out.println("Unicode letter is: " + unicodeVal);

        //Strings
        String name = "Fiona";
        String name1 = new String("Fiona");

        String message = "Fiona saysy\b \"Hello\" \n\tHow are you?";
        //we use backslash to use single and double quotes
        // we use \n to print remaining text in next line
        // we use \t to use tab
        // we use \b to backspace, hence y is not printed

        System.out.println(message);

        String[] carBrands = {"Volvo", "BMW", "Ford"};
        System.out.println(carBrands);
        System.out.println(Arrays.toString(carBrands));
        System.out.println("Number of Brands: " + carBrands.length);
        System.out.println(carBrands[0]);
        System.out.println(carBrands[1]);
        System.out.println(carBrands[2]);

        carBrands[0] = "Kia";
        System.out.println(Arrays.toString(carBrands));


    }
}


public class Operators {
    public static void main(String[] args) {
        long num1 = 20, num2 = 6;

        long resultLong = num1 / num2;
        float resultFloat = num1 / num2;
        double resultDouble = num1 / num2;

        // when we select long, we are getting quotient, and we use % for remainder
        // result will be 3 because both the operands i.e., both the numbers are long
        System.out.println("Result in Long type: " + resultLong);
        System.out.println("Result in float type: " + resultFloat);
        System.out.println("Result in double type: " + resultDouble);

        double num3 = 20d, num4 = 7d;
        double result = num3 / num4;
        System.out.println("Result in double type: " + result);

        double resultByZero = num3 / 0.0;
        System.out.println("Result when float or double is divided by 0: " + resultByZero);//Infinity

//        long resultByIntZero = num1/0;
//        System.out.println("Result when integer is divided by 0: " + resultByIntZero);//ArithmeticException

        System.out.println("Will this line be executed"); //NO


        //Assignment operators
        System.out.println("all give the same output" + num3);
        num3 = num3 + 1;
        num3 += 1;
        num3++;
        System.out.println("all give the same output" + num3);

        int a = 10, b = 5, c = 0, d = 0;
        System.out.println("initial values");
        System.out.println("a = " + a + "\tb = " + b);
        System.out.println("c = " + c + "\td = " + d);

        c = a++; // assigned first and then increased
        d = ++b; // increased first and then assigned

        System.out.println("a = " + a + "\tb = " + b);
        System.out.println("c = " + c + "\td = " + d);


        //string comparison
        String x = "java", y = "random";
        System.out.println("Comparing x with y: " + x.equals(y));
        System.out.println("Comparing x with Java: " + x.equals("Java"));
        System.out.println("Comparing x with java: " + x.equals("java"));
        System.out.println("Comparing x with Java, ignoring case: " + x.equalsIgnoreCase("Java"));

        float myFloat = 1.25f;
        int floatToInt = (int)myFloat;
        System.out.println(floatToInt);

        System.out.println(x.toUpperCase());


    }
}
