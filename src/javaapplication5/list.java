/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;

public class list {

    public static void main (String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();
//        names.add("Mateo");
        names.add("Danny");
        names.add("Joe");
        names.add("Alex");
        
        System.out.println(names.size() + " people in the list");
        
// Access list through  it index
        System.out.println("name[0] = " + names.get(0));
        System.out.println("name[3] = " + names.get(3));
        
        // Iterate through ArrayList usign foreach
        for (String name: names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        // Iterate through ArrayList using index (reverse)
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
        
        // Check if the list contain Mateo
        if (names.contains("Mateo")) {
            System.out.println("Mateo is in the list");
        } else {
            System.out.println("Mateo is not in the list");
        }
        
        // Get Danny's index
        int dannyIndex = names.indexOf("Danny");
        System.out.println("Index of Danny is " + dannyIndex); 
        // Change Danny to Max
        names.set(dannyIndex, "Max");
        
        // Remove joe from the list
        names.remove("Joe");
        
        // Iterate through ArrayList usign foreach
        for (String name: names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        // Clear all list data
        names.clear();
        
        if(names.isEmpty()) {
            System.out.println("List is now empty");
        }

    }

}