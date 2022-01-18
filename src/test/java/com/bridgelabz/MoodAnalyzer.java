package com.bridgelabz;

public class MoodAnalyzer {
    public static String message;

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() throws MoodAnalyzerException{
        try{
        if (message.contains("Sad")) {
            return "SAD";
        } else if (message.contains("Any")) {
            return "Any";
        }
        return "Enter valid string";
    }
        catch (NullPointerException e){
            throw new MoodAnalyzerException("Entered Invalid Mood");
        }
    }
}

