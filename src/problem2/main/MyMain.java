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
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(45);
        tree.insert(75);
        tree.insert(23);
        tree.insert(34);
        tree.insert(65);
        tree.insert(76);
        tree.insert(89);

        System.out.println("Post Order Traversal");
        tree.traversePostOrder(tree.getRoot());

        System.out.println();
        System.out.println("Pre Order Traversal");
        tree.traversePreOrder(tree.getRoot());
    }
}
