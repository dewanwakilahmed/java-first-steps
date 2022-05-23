package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int minValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMinIntValue + 1));
        System.out.println("Busted MAX value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("Integer Max Value Test = " + myMaxIntTest);
    }
}