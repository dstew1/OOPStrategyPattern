/*
Student Name: Daniel Stewart    
Student Number: 041029499
Course & Section #: 23S_CST8288_021
Declaration:
This is my own original work and is free from Plagiarism.
*/
package folder;

/**
 * This class controls the unit conversions of this program
 * @author Daniel Stewart
 * @version 20.0.1
 * 
 */
public class UnitConverter {
    
    private UnitTypeConverter converter;
    private double value;
    private double convertedVal;

    
    /**
     * Returns the original value to be converted
     * @return value value to be converted
     */
    public double getValue() {
        return value;
    }

    /**
     * Returns the converted value
     * @return convertedVal converted value from value
     */
    public double getConvertedVal() {
        return convertedVal;
    }
   
    /**
     * Sets unit type
     * @param converter UnitTypeConverter object
     */
    public void setUnitType(UnitTypeConverter converter){
        this.converter = converter;
        
    }
    
    /**
     * Converts Value
     * @param value value to be converted
     * @return converter.convert(value) conversion of value
     */
    public double convert(double value){
        
        return converter.convert(value);
        
    }
    

}
