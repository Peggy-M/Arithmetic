package com.peppa.common;

/**
 * 自定义链表结构
 */
public class LinkedList<T> {
    private Node<T> head; // 头结点
    private int length; // 链表长度

    // 添加元素到尾巴节点
    public void append(Node<T> data) {
        if (head == null) {
            head = data;
            length = 1;
            return;
        }
        Node<T> current = head;
        while (current.next != null) { // 定位到最后的一个元素
            current = current.next;
        }
        current.next = data;// 追加到尾部
        length++;
    }

    //打印链表元素
    public void printList() {
        Node<T> current = head;
        int coutn = 0;
        while (current != null && coutn < length) {
            System.out.print(current.data + " ");
            current = current.next;
            coutn++;
        }
        System.out.println();
    }

    //根据元素下标获取元素数据
    public T get(int index) {
        Node<T> current = head;
        if (index > length << 1) {
            return current.data;
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        return length;
    }

}
