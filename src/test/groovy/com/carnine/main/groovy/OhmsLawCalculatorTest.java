package com.carnine.main.groovy;

import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OhmsLawCalculatorTest {


    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateVoltageWithValidParameters() {
        double result = OhmsLawCalculator.calculateVoltage(3.2, 50);
        Assert.assertEquals(result, 160.0);
    }

    @Test
    public void testCalculateResistanceWithValidParameters() {
        double result = OhmsLawCalculator.calculateResistance(8, 2);
        Assert.assertEquals(result, 0.25);
    }

    @Test
    public void testCalculateCurrentWithValidParameters() {
        double result = OhmsLawCalculator.calculateCurrent(5, 0.5);
        Assert.assertEquals(result, 10.0);
    }

    @Test
    public void testCalculatePowerWithValidParameters() {
        double result = OhmsLawCalculator.calculatePower(5, 0.5);
        Assert.assertEquals(result, 2.5);
    }

}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme