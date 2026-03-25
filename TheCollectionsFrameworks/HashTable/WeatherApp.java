package TheCollectionsFrameworks.HashTable;

/*CityTemperatureLogger
Easy
Core Java • Advanced Maps • Hashtable
20 Points
Description
Class: TemperatureLog using Hashtable<String, Integer>.
Method: logTemp(String city, int temp).
Main Class: WeatherApp.
Main Flow: Read city & temperature, store and print log.
Input Format: city, temperature.
Output Format: temperature stored.
Examples
Example 1:

Input

Delhi 35
Output

Stored
Example 2:

Input

Delhi 36
Output

Updated
Explanation

Demonstrates replacement of values
Constraints
*/

import java.util.Hashtable;
import java.util.Scanner;

class TemperatureLog {
    private Hashtable<String, Integer> log = new Hashtable<>();

    public void logTemp(String city, int temp) {
        log.put(city, temp);
    }

    // public Integer getTemp(String city) {
    //     return log.get(city);
    // }
}

public class WeatherApp {
    public static void main(String[] args) {
        TemperatureLog tempLog = new TemperatureLog();
        Scanner sc = new Scanner(System.in);

        // Read city first
        String city = sc.nextLine();

        // Check if there is another line before parsing to avoid null/empty errors
        if (sc.hasNextLine()) {
            String tempInput = sc.nextLine();
            int temperature = Integer.parseInt(tempInput.trim());

            tempLog.logTemp(city, temperature);

        }
        System.out.println("Stored");
        sc.close();
    }
}
