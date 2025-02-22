/*
 * *** Michael Wardlow / 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.


    // Create two temporary TreeSets to copy what's in the original sets
    TreeSet<Integer> tempSetA = new TreeSet<>(setA);
    TreeSet<Integer> tempSetB = new TreeSet<>(setB);

    tempSetA.addAll(tempSetB);        // Combine the elements of setA and setB using tempSetA

    tempSetB.retainAll(setA);     // tempSetB now retains all the elements that are common between setA and setB

    tempSetA.removeAll(tempSetB);     // tempSetA, having all the elements, now removes all of the common elements between setA and setB, which are in tempSetB

    return tempSetA;    // Returns the temporary TreeSet that contains all elements that are not in both sets
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.
    Iterator<Integer> iterator = treeMap.keySet().iterator();   // Iterator to get to te keys in the map

    while (iterator.hasNext()) {        // Loop going to every key in the map
      Integer key = iterator.next();    // Go to the next Key
      if (key % 2 == 0) {           // check if the key is even
        iterator.remove();        // remove the current key value pair from the Map when it is even
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    if (tree1.equals(tree2)) {         // using .equals() to see if both trees are equal to each other
      return true;              // returns true (boolean value) if the trees are equal
    } else {
      return false;             // returns false if the trees are not equal
    }

  }

} // end treeProblems class
