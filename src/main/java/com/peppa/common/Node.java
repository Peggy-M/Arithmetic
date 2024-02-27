package com.peppa.common;

/**
 * 自定义对的节点元素
 * @param <T>
 */

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node(T data){
        this.data=data;
        this.next=null;
    }
}
