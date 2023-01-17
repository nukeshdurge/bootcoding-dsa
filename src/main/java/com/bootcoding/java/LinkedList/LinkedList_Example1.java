package com.bootcoding.java.LinkedList;

public class LinkedList_Example1 {
    public static void main(String[] args) {

        Node head = createLinkedList();
        print(head);
        head = insertNodeAtFirst(head);
        print(head);

    }

    public static Node createLinkedList() {

        Node FirstNode = new Node(10);
        Node SecondNode = new Node(20);
        Node ThirdNode = new Node(30);
        Node ForthNode = new Node(40);


        FirstNode.next = SecondNode;
        SecondNode.next = ThirdNode;
        ThirdNode.next = ForthNode;
        Node head = FirstNode;
        return head;
    }
    public static Node insertNodeAtFirst(Node head){
        Node newNode=new Node(50);
        newNode.next=head;
        head=newNode;
        return  head;

    }

    //print(Traverse)--> head
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }


}

