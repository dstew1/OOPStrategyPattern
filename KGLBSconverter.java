/*
Student Name: Daniel Stewart    
Student Number: 041029499
Course & Section #: 23S_CST8288_021
Declaration:
This is my own original work and is free from Plagiarism.
*/
package folder;

/**
 * This class provides uses the overridden convert() method to convert kilograms to pounds
 * @author Daniel Stewart
 * @version 20.0.1
 * 
 */
public class KGLBSconverter implements UnitTypeConverter {
    private final double convFactor=2.205;
    
    
    
    /**
     * Overrides the convert method to convert kilos to pounds
     * @param kilograms
     * @return the converted weight value in pounds
     */
    @Override
    public double convert(double kilograms) {
	
        return kilograms*convFactor;
	
    
    }
    
}
