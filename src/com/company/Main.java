package com.company;

public class Main {

    public static void main(String[] args) {
        sendResultWeather("+0C");
        sendResultWeather("-0C");
        sendResultWeather("0C");

        sendResultWeather("+34C");
        sendResultWeather("+14C");
        sendResultWeather("+4C");
        sendResultWeather("+44C");
        sendResultWeather("+104C");
        sendResultWeather("-8C");

        sendResultWeather("+");
        sendResultWeather("0");
    }

    public static void sendResultWeather(String str){
        try {
            String answer = str.substring(1, str.indexOf("C"));
            char charAtZero = str.charAt(0);

            String result = charAtZero == '0'                                                          ? "Its windy outside, but we are sure you will enjoy your day!" :
            (charAtZero == '-' && (Integer.parseInt(answer) <= 50) && (Integer.parseInt(answer) > 1))  ? "Its super cold today. Be sure dress well!":
            (charAtZero == '+' && (Integer.parseInt(answer) >= 0) &&  (Integer.parseInt(answer) < 10)) ? "Its windy outside, but we are sure you will enjoy your day!":
            (charAtZero == '-' && (Integer.parseInt(answer) >= 0) &&  (Integer.parseInt(answer) < 10)) ? "Its windy outside, but we are sure you will enjoy your day!":
            (Integer.parseInt(answer) >= 0 && (Integer.parseInt(answer) < 10))                         ? "Its windy outside, but we are sure you will enjoy your day!":
            (charAtZero == '+' && (Integer.parseInt(answer) >= 11) && (Integer.parseInt(answer) < 30)) ? "Its time for outdoor walking!":
            (charAtZero == '+' && (Integer.parseInt(answer) >= 31) && (Integer.parseInt(answer) < 40)) ? "Its so hot outside!":
            (charAtZero == '+' && (Integer.parseInt(answer) >= 41) && (Integer.parseInt(answer) < 50)) ? "Welcome to hell!": "Please re-check result in 5 mins";

            System.out.println(result);
        }
        catch (Exception e){ System.out.println("Incorrect data");}
    }
}
