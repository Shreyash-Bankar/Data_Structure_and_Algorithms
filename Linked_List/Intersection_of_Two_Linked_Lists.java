/*
In a system there are two singly linked list. By some programming error, the end node of one
of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a
program to get the point where two linked lists merge.
We have to find the intersection part in this system.
*/

import java.util.*;

public class Intersection_of_Two_Linked_Lists{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  static Node head1;
    public  static Node head2;
    public  static Node tail;
    

    public static void findIntersection(Node head1, Node head2){
        while(head1 != null){
        Node temp = head2;
            while(temp !=  null){
                if(head1 == temp){
                    System.out.print(head1.data);
                    return;
                }
                temp = temp.next;
            } 
            head1 = head1.next;
        }
        
    }   


    public static void main(String args[]){

        Intersection_of_Two_Linked_Lists linkedList = new Intersection_of_Two_Linked_Lists();
        head1 = new Node(4);
        head1.next = new Node(5);
        Node intersection = head1.next.next = new Node(6);
        tail = head1.next.next.next = new Node(7);

        head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = intersection;

        linkedList.findIntersection(head1,head2);

    }
}