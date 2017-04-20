import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Helper class for the final
 */
public class Helper
{
    /*
     * Converts from one unit to another, depending on the mode.
     * For mode 1, converts kilometers to miles
     * For mode 2, converts miles to kilometers
     */
    public static double Converter(double value, int mode)
    {
        double distance = 0;
        
        if (mode ==1){
            double kilometers;
            
            kilometers = value;
            
            distance = kilometers * 0.621371;
            
        }
        
        if (mode == 2){
            double miles;   // To hold the miles

            miles = value;

            // Convert miles to kilometers
            distance = miles * 1.609344;
            

        }
        
        return distance;
    }
    
    /*
     * Generate random numbers between min and max (with min and
     * max included). It should generate count random numbers and
     * return an array
     */
    public static int[] generateRandom(int count, int min, int max)
    {
            int[] numbers = new int[count];       
            //Generates 10 Random Numbers in the range 1 -20
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*max + min);
        }
        return numbers;
    }
    
    /*
     * Find the smallest number greater than 1 that divides both n1 and n2
     */
    public static int findSmallestNumberThatDivides (int n1, int n2)
    {
        

    
        int r=0, a, b;
        a = (n1 > n2) ? n1 : n2; // a is greater number
        b = (n1 < n2) ? n1 : n2; // b is smaller number
 
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;

    }
    
    /*
     * find mean of an array
     * Find the mean of the numbers in values
     */
    public static double findMean(double[] values)
    {
                    //define an array
                double[]findMean = new double[]{1, 2, 3};
               
                /*
                 * Average value of array elements would be
                 * sum of all elements/total number of elements
                 */
               
                //calculate sum of all array elements
                double sum = 0;
               
                for(int i=0; i < findMean.length ; i++)
                        sum = sum + findMean[i];
               
                //calculate average value
                double mean = sum / findMean.length;
               
                
                return mean;
        }

    
    
    /*
     * Check if the SSN was issued in Michigan. 
     * The first three digits of the SSN are between 
     * 362 and 386.
     */
    public static boolean isMichiganSSN(long ssn)
    {
        return false;
    }
    
    /*
     * Given a rate r, calculate the doubling time.
     * https://en.wikipedia.org/wiki/Doubling_time
     */
    public static double calculateDoublingTime(double r)
    {
        return 0;
    }
    
    /*
     * Create a new Product object.
     * The ID has the following rule:
     * offset is added to from 222000
     * Color code 1 is R, code two is B
     * Revision is added to the end
     * So, offset of 111, colorCode of 2 and revision 3 has id 222111B3 
     */
    public static Product makeProduct(int offset, int colorCode, int revision)
    {

        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        int x = 1;
        int y = 2;

        return null;
    }
    
    /*
     * Return the NetworkInterface with the given MAC_address. If not found,
     * return null
     */
    public static WirelessAdapter findbyMACAddress(WirelessAdapter[] nics, String MAC_address)
    {
        return null;
    }
    
    /*
     * Helper function to generate a random MAC address
     */
    public static String randomMACAddress(int seed)
    {
        Random rand = new Random();
        rand.setSeed(seed);
        
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally administered

        StringBuilder sb = new StringBuilder(18);
        for(byte b : macAddr)
        {
            if(sb.length() > 0)
                sb.append(":");
            sb.append(String.format("%02x", b));
        }

        return sb.toString().toUpperCase();
    }
}
