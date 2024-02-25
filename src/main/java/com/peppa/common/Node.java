package com.peppa.common;

/**
 * 自定义对的节点元素
 * @param <T>
 */
public class Node<T> {
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
        this.next=null;
    }
}
