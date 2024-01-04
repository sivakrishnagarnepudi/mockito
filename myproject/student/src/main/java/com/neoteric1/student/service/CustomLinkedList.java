package com.neoteric1.student.service;

import collection.HoldingHand;

import java.util.LinkedList;

public class CustomLinkedList {
    HoldingHand startPoint;
    HoldingHand endPoint;
    public void insert(String name){
        HoldingHand holdingHand=new HoldingHand(name);
            if (startPoint==null){
                startPoint=holdingHand;
                endPoint=holdingHand;
        }else{
                endPoint.next=holdingHand;
                endPoint=holdingHand;
            }
    }

    public void selection() {
        HoldingHand current = startPoint;
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main (String[]args){
        CustomLinkedList list=new CustomLinkedList();
        list.insert("Chandu");
        list.insert("Sudheer");
        list.insert("Sasank");
        list.insert("Chandan");
        list.insert("Aparana");
        list.selection();
    }

}
