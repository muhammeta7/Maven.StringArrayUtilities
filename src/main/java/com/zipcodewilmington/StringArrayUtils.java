package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean containsValue =  false;
        for(String element : array) {
            if ( element.equals(value) ) {
                containsValue = true;
            }
        }
        return containsValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int newIndex = 0;
        for( int i= array.length-1; i >= 0; i--) {
            reverseArray[newIndex] = array[i];
            newIndex++;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int j = array.length-1;
        for(int i = 0; i < array.length/2 ; i++) {
            if( !array[i].equals(array[j])) {
                return false;
            }
            j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newString = String.join("", array);
        int counter = 0;
        for ( int i = 0; i < alphabet.length() ; i++ ) {
            //newString.substring(i,i+1);
            for (int k = 0; k < newString.length(); k++) {
                //alphabet.substring(k, k+1);
                //System.out.println(alphabet.substring(k, k+1) + " " + newString.substring(i,i+1));
                if ( alphabet.substring(i, i+1).equalsIgnoreCase(newString.substring(k,k+1))) {
                    counter++;
                    break;
                }
            }
        }
        return counter == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length; i++) {
            if ( array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }



    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(valueToRemove)) {
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 0;
        int arrayLength = array.length;
        int iterator = 0;
        for (int i = array.length-1; i > 0; i--) {
            if (array[i] != null && array[i].equals(array[i-1])) {
                array[i] = null;
                counter++;
            }
        }
        String[] duplicatesRemoved = new String[arrayLength-counter];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] != null) {
                duplicatesRemoved[iterator] = array[i];
                iterator++;
            }
        }
        return duplicatesRemoved;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int counter = 0;
        int arrayLength = array.length;
        int iterator = 0;
        for (int i = array.length-1; i > 0; i--) {
            if (array[i] != null && array[i].charAt(0) == array[i-1].charAt(0) ) {
                array[i-1] += array[i];
                array[i] = null;
                counter++;
            }
        }
        String[] packConsecutive = new String[arrayLength-counter];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] != null) {
                packConsecutive[iterator] = array[i];
                iterator++;
            }
        }
        return packConsecutive;
    }

}
