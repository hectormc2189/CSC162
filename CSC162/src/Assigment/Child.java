package Assigment;

import java.util.ArrayList;

/* Author: Hector Mata
 * Date: 10/03/2022
 * Prof Suero
 * CSC162 Assignment 1
 * Child class
*/

public class Child extends Parent {

    // #region Constructors

    public Child() {
        this(new ArrayList<>());
    }

    public Child(ArrayList<Integer> list) {
        super(list); // Parent(list)
    }

    // #endregion
    
}