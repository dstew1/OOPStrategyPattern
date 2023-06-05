/*
Student Name: Daniel Stewart    
Student Number: 041029499
Course & Section #: 23S_CST8288_021
Declaration:
This is my own original work and is free from Plagiarism.
*/
package folder;


/**
 * This is the test class of the program which tests all 4 conversions.
 * @author Daniel Stewart
 * @version 20.0.1
 * 
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    
    public static void main(String[] args) {
        UnitConverter unitconverter = new UnitConverter();
        
        
        
        unitconverter.setUnitType(new CFconverter());
        double celsius = 30.0;
        double fahrenheit = unitconverter.convert(celsius);
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        
        unitconverter.setUnitType(new FCconverter());
        fahrenheit = 86.0;
        celsius = unitconverter.convert(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
        
        // Test weight conversion
        unitconverter.setUnitType(new KGLBSconverter());
        double kilograms = 10.0;
        double pounds = unitconverter.convert(kilograms);
        System.out.println(kilograms + " Kilograms = " + pounds + " Pounds");
        
        unitconverter.setUnitType(new LBSKGconverter());
        pounds = 22.05;
        kilograms = unitconverter.convert(pounds);
        System.out.println(pounds + " Pounds = " + kilograms + " Kilograms");
        
        
    }
}

		
  


