/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args)
    {
        Node newNode =new Node(new Student());
        MyCircularQueue m=new MyCircularQueue();
        for (int i = 0; i <10 ; i++)
        {
            m.enqueue(newNode);
        }
        m.printQueue();


        m.remove(m.getFront()); //refrence of node to be deleted;
        m.process(m.getFront());





    }
}
