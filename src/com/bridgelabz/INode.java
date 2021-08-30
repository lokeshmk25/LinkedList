package com.bridgelabz;

public interface INode<K> {
    K getkey();
    void  setkey(K key);

    INode getNext();
    void setNext(INode next);
}
