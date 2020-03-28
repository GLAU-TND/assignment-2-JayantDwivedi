/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree m = new MyBinarySearchTree();
        Functions mthds = new Functions();
        for (int i = 0; i < 10; i++) {
            m.insert(m.getRoot());
        }


        mthds.printPostOrder(m.getRoot());
        mthds.printPreOrder(m.getRoot());
        System.out.println(mthds.verify_A());


        System.out.println(mthds.verify_B());
    }
}
