package com.bridgelabz;

public class MoodAnalyzer {
    public static String message;

    public MoodAnalyzer(String message){
        this.message = message;
        analyseMood();
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        try{
        if (message.contains("Sad")) {
            return "SAD";
        } else if (message.contains("Any")) {
            return "Any";
        }
        return "Enter valid string";
    }
        catch (NullPointerException e){
            return "HAPPY";
        }
    }
}

