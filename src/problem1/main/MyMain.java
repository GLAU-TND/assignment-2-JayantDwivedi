/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        {
            MyBinarySearchTree m = new MyBinarySearchTree();
            m.setRoot(new Scanner(System.in).nextInt());
            System.out.println("root set" + m.getRoot().getData());
            for (int i = 0; i < 10; i++) {
                m.insert(m.getRoot());
            }
            m.printLeftChildren();


        }
    }
}
