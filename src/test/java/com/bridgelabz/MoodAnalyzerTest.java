package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("User is Sad");
        String actualresult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", actualresult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnAny() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Any message");
        String actualresult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("Any", actualresult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            String actualresult = moodAnalyzer.analyseMood();
            Assertions.assertEquals("Entered Invalid Mood", actualresult);
        }
        catch (MoodAnalyzerException e)
        {
            System.out.println(e);
        }
    }
}