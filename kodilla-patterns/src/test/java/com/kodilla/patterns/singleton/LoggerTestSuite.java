package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
        logger = new Logger();
        logger.log("abd");
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("abd", lastLog);
    }
}
