/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.Node;
import problem5.student.Student;


//to implement circular queue

public class MyCircularQueue {
    Node front,tmp;

    public MyCircularQueue() {
        front=null;
        tmp=null;
    }

    public void enqueue(Node newNode)
    {
        newNode= new Node(new Student());
        if(front==null)
        {
            tmp=front=newNode;
            return;
        }
        if(tmp.getNext()!=null)
        {
            tmp.setNext(newNode);
            newNode.setNext(tmp);
            return;
        }
        newNode.setNext(tmp.getNext());
        tmp.setNext(newNode);
    }
    public void printQueue()
    {
        tmp=front;
        while(tmp.getNext()!=front)
        {
            System.out.println(tmp.getS().toString());
            tmp=tmp.getNext();
        }


    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getTmp() {
        return tmp;
    }

    public void setTmp(Node tmp) {
        this.tmp = tmp;
    }

    public void remove(Node node)
    {
        tmp=front;
        if(node.getS().getBacklog()==0 && node == front) {
            tmp = front = front.getNext();
        }
        else  if (node.getS().getBacklog()==0 && node!=front)
        {
            {
                while (tmp.getNext() != node || tmp.getNext() != front) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(tmp.getNext().getNext());
            }
        }

        System.out.println("Node not found or backlog is not zero");

    }
    public void process(Node node)
    {
        if(node==front)
        {
            while(node.getNext()!=null ||node.getNext()!=front)
            {
                node=node.getNext();
            }
            System.out.println("processed value : "+(node.getS().getBacklog()-node.getS().getApperingcount()));
        }
        else{
            System.out.println("only front node can be processed");
        }

    }
}
