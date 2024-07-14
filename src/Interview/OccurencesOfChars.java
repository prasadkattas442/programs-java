package Interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OccurencesOfChars {
    public static void main(String[] args) {
    	//first repeted charchter--E and non repeated--W
       	//second repeted charchter--O and non repeated--L
    	//highest repeated charchter--A
    	//lowest repeated  charchter--W
    	
        String str = "Welcome to javaa";
        HashMap<Character, Integer> myMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c) + 1);
            } else {
                myMap.put(c, 1);
            }
        }        
        System.out.println(myMap);//print chars with their occurences        
        System.out.println("*****************************************************");
        Set<Map.Entry<Character, Integer>> entrySet = myMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());//print chars with occurences more than to 1              
            }
        }
        System.out.println("*****************************************************");
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() <= 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());//print chars with occurences less than/equal to 1
            }
        }
        int nonRepeatedCount = 0;
        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
                if (entry.getValue() == 1) {
                    nonRepeatedCount++;
                    if (nonRepeatedCount == 1) {
                    	System.out.println("First non reapeated character: "+entry.getKey() + " " + entry.getValue());                  
                    } else if (nonRepeatedCount == 2) {
                    	System.out.println("Second non reapeated character: "+entry.getKey() + " " + entry.getValue());
                         break;
                    }
                }
               
            }
        System.out.println("******** Chat GPT repeated character************************");
        int RepeatedCount = 0;
        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() > 1) {
                RepeatedCount++;
                if (RepeatedCount == 1) {
                	System.out.println("First reapeated character: "+entry.getKey() + " " + entry.getValue());                  
                } else if (RepeatedCount == 2) {
                	System.out.println("Second reapeated character: "+entry.getKey() + " " + entry.getValue());
                     break;
                }
            }           
        }
        char highestRepeatedChar = '\0';
        char lowestRepeatedChar = '\0';
        int highestCount = Integer.MIN_VALUE;
        int lowestCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            int count = entry.getValue();
            if (count > 1) { // Only consider repeated characters
                if (count > highestCount) {
                    highestCount = count;
                    highestRepeatedChar = entry.getKey();                   
                }
                if (count < lowestCount) {
                    lowestCount = count;
                    lowestRepeatedChar = entry.getKey();                   
                }
            }           
        }
        System.out.println("The highest repeated character is: " + highestRepeatedChar + " with count " + highestCount);
        System.out.println("The lowest repeated character is: " + lowestRepeatedChar + " with count " + lowestCount);      
    }
}
