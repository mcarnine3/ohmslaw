package com.carnine.main.groovy

/**
 * This class demonstrates the use of Ohm's Law.
 * Ohm’s Law states that the voltage across a conductor is directly
 * proportional to the current flowing through it, provided all physical conditions
 * and temperature, remain constant.
 */
class OhmsLawCalculator {
    /**
     * Calculates resistance (R) using Ohm's law (V = IR)
     * @param voltage the voltage in volts
     * @param current the current in amperes
     * @return the calculated resistance in ohms
     * @throws ArithmeticException if the voltage is zero
     */
    static double calculateResistance(double voltage, double current) {
        double resistance = 0
        if(voltage == 0){
            throw new ArithmeticException("Current cannot be ${voltage}")
        }else {
            resistance = current / voltage
        }
        return resistance
    }

    /**
     * Calculates voltage using Ohm's law (V = IR)
     * @param current the current in amperes
     * @param resistance the resistance in ohms
     * @return the calculated voltage in volts
     * @throws ArithmeticException if the current or resistance is zero
     */
    static double calculateVoltage(double current, double resistance) {
        double voltage = 0
        try {
            if(current == 0 || resistance == 0 ){
                throw new ArithmeticException("Current or resistance cannot be Zero.")
            }else {
                voltage = current * resistance
            }
        }
        catch (Exception e) {
            println("Exception caught: " + e.getMessage())
        }
        return voltage
    }
/*
    Adding a comment to test action
 */
    static double calculateCurrent(double voltage, double resistance) {
        double current = 0
        try {
            if(voltage == 0 || resistance == 0 ){
                throw new ArithmeticException("Voltage or resistance cannot be Zero.")
            }else {
                current = voltage / resistance
            }
        }
        catch (Exception e) {
            println("Exception caught: " + e.getMessage())
        }
        return current
    }

    /**
     * Calculates power (P) using Ohm's law (P = VI)
     * @param voltage the voltage in volts
     * @param current the current in amperes
     * @return the calculated power in watts
     * @throws ArithmeticException if the voltage or current is zero
     */
    static double calculatePower(double voltage, double current) {
        double power = 0.0
        if(voltage == 0 || current == 0){
            throw new ArithmeticException("Voltage or current cannot be Zero.")
        }else {
            power = voltage * current
        }
        return power
    }
}