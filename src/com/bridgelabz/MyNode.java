package com.bridgelabz;
    public class MyNode<K> implements INode{
        private INode next;
        private K key;

        public MyNode(K Key) {
            this.key = Key;
            this.next = null;
        }

        @Override
        public Object getkey() {
            return key;
        }

        @Override
        public void setkey(Object key) {
        this.key= (K) key;
        }


        public INode getNext(){
            return next;
        }

        public void setNext(INode next) {
            this.next = next;
        }
    }

