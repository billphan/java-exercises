package org.launchcode.java.studio;


import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {
    public static void main(String[] args){

        // Dictionary to hold the keys and values
        HashMap<Character, Integer> amountKeeper = new HashMap<>();

        // Variable to hold the string to be read
        String readMe = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        // Loop though each character
        for (char letter:readMe.toCharArray()){
            // If the HashMap doesn't contain the key then add the letter HashMap
            if (!amountKeeper.containsKey(letter)){
                amountKeeper.put(letter,1);
            }
            // Otherwise if the key already exists update the value of the key
            else{
                amountKeeper.put(letter,amountKeeper.get(letter)+1);
            }
        }
        // Print the keys and its its values
        for (Map.Entry<Character,Integer> storedValues:amountKeeper.entrySet()) {
            System.out.println(storedValues.getKey() + " : " + storedValues.getValue());
        }
    }
}









