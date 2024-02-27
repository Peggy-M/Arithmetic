package com.peppa.common;

/**
 * 自定义链表结构
 */
public class LinkedList<T> {
    private Node<T> head;

    private int length;

    // 添加节点到链表末尾
    public void append(Node<T> newNode) {
        if (head == null) {
            head = newNode;
            length = 1;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            length++;
        }
    }

    // 获取链表中的节点
    public Node<T> get(int index) {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current;
            }
            current = current.next;
            count++;
        }
        return null;
    }

    // 打印链表内容
    public void printList() {
        Node<T> current = head;
        int count = 0;
        while (current != null && count < length) {
            count++;
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public int getSize() {
        return length;
    }

}
