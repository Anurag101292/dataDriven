package com.CN.rough.Lnklst;

public class LinkedList {
    //this refer to te head node
    Node head;
    public void insert(int data){
        Node node = new Node();
        //Assign the data to node
        node.data = data;
        node.next = null;
        //checking the condition that this insertion is first or not
        if(head == null){
            //assign value to head
            head = node;
        }
        else{
            //temporary assign the value
            Node n =head;
            while(n.next!=null){
                n=n.next;
            }
           n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node= node.next;
        }
        System.out.println(node.data);
    }
}
