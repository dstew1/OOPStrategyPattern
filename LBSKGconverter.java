/*
Student Name: Daniel Stewart    
Student Number: 041029499
Course & Section #: 23S_CST8288_021
Declaration:
This is my own original work and is free from Plagiarism.
*/
package folder;

/**
 * This class provides uses the overridden convert() method to convert pounds to kilograms
 * @author Daniel Stewart
 * @version 20.0.1
 * 
 */
public class LBSKGconverter implements UnitTypeConverter {
    private final double convFactor=2.205;
    
    /**
     * Overrides the convert method to convert pounds to kilos
     * @param pounds
     * @return the converted weight value in kilograms
     */
    @Override
    public double convert(double pounds) {
	
        return pounds/convFactor;
	
    
    }
}
