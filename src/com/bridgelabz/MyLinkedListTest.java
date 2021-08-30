package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {


        @Test
        public void given3NumbersWhenAddedToLinkedListAhouldBeAddedToTop () {
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myFirstNode = new MyNode<>(56);

            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.add(mySecondNode);
            myLinkedList.add(myThirdNode);
            myLinkedList.printMyNodes();

            boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
            Assert.assertTrue(result);
        }


    @Test
    public void given3NumbersWhenAppendShouldBeAddedLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListRsult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.pop(myFirstNode);
        myLinkedList.printMyNodes();
        boolean result=myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    private class MyLinkedList {
            private INode tail;
            private INode head;

            public MyLinkedList() {
                this.head = null;
                this.tail = null;
            }

            public void add(INode newNode) {
                if (this.tail == null) {
                    this.tail = newNode;
                }
                if (this.head == null) {
                    this.head = newNode;
                } else {
                    INode tempnode = this.head;
                    this.head = newNode;
                    this.head.setNext(tempnode);
                }
            }
            public void append(INode newNode) {
                if (this.head == null) {
                    this.head = newNode;
                }
                if (this.tail == null) {
                    this.tail = newNode;
                } else {
                    this.tail.setNext(newNode);
                    this.tail=newNode;
                }

            }

            public INode pop(MyNode<Integer> myFirstNode) {
                INode tempNode = this.head;
                this.head.setNext(tempNode);
                return tempNode;
            }

            public void printMyNodes() {
                StringBuffer myNodes = new StringBuffer("My Nodes");
                INode tempnode = head;
                while (tempnode.getNext() != null) {
                    myNodes.append(tempnode.getkey());
                    if (!tempnode.equals(tail)) myNodes.append("->");
                    tempnode = tempnode.getNext();
                }
                myNodes.append(tempnode.getkey());
                System.out.println(myNodes);
            }


        public void insert(INode mynode , INode newnode) {
                INode tempnode=mynode.getNext();
                mynode.setNext(newnode);
                newnode.setNext(tempnode);
        }
    }
    }
