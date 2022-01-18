package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("User is Sad");
        String actualresult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", actualresult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnAny() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Any message");
        String actualresult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("Any", actualresult);
    }
    @Test
    public void givenMessage_Null_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String actualresult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", actualresult);
    }
}