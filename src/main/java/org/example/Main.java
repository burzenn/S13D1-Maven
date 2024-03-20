package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (isBarking && 8 <= clock && clock <= 20) {
            return true;
        } else if (clock < 0 || clock > 23){
            return false;
        } else {
            return false;
        }

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if (13 < firstAge && firstAge <=19 || 13 < secondAge && secondAge <19 || 13 < thirdAge && thirdAge <19) {
            return true;
        } else {
            return false;
        }
       
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if (isSummer && 25 <= temp && temp <= 35) {
            return true;
        } else if (!isSummer && 25 <= temp && temp <= 45) {
            return true;
        } else {
            return false;
        }
     
    }

    public static double area(double width, double height) {

        double result = width * height ;
        if (width < 0 || height < 0) {
            return -1 ;
        } else {
            return result;
        }
    }

    public static double area(double radius) {

        double result = radius*radius*Math.PI ;
        if (radius < 0) {
            return -1 ;
        } else {
            return result;
        }
    }
}
