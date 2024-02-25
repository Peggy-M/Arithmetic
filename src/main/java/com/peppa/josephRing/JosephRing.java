package com.peppa.josephRing;

import com.peppa.common.LinkedList;
import com.peppa.common.Node;

import java.util.HashSet;
import java.util.List;

/**
 * 题目:
 * 给定两个可能有环也可能无环的单链表，头结点 head1 和 head2。
 * 请实现一个函数,如果两个链表相交，请返回相交的 第一个节点 。如果不相交，返回 null
 * 【要求】
 * 如果两个链表的长度之和为 N ，时间复杂度请达到 O(N) , 额外空间复杂度请达到 O(1) 。
 */
public class JosephRing {
    /* 思路一 (空间复杂度无法达到要求)使用容器完成约瑟夫环:
       比如无环链表: head->A->B->C->D->E->null 与 有环链表: head->A->B->C->D->B->E->null
       可以使用 hash 表进行存储,当因为 hash 表中存储的元素都是唯一的，也就是说当我们在遍历链表的过程当中，
       将元素置入 hash 表当中，如果链表遍历但最后一个 null 都没有出现重复的元素，则表示该链表不存在环。
       如果在遍历的过程当中，一但出现重复的元素，则表示该链表已经形成了一个环。
    */

    /**
     * 利用容器实现环的查找
     *
     * @param elements
     * @param <E>
     * @return
     */
    public static <E> E vesselScreen(LinkedList<E> elements) {
        HashSet<E> screen = new HashSet<E>();
        for (int i = 0; i < elements.getSize(); i++) {
            E data = elements.get(i);
            if (screen.contains(data))
                return data;
            screen.add(data);
        }
        return null;
    }

    /**
     * 运行程序
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        Node<Integer> integerNode_1 = new Node<Integer>(1);
        Node<Integer> integerNode_2 = new Node<Integer>(2);
        Node<Integer> integerNode_3 = new Node<Integer>(3);
        Node<Integer> integerNode_4 = new Node<Integer>(4);
        Node<Integer> integerNode_5 = new Node<Integer>(5);
        Node<Integer> integerNode_6 = new Node<Integer>(6);
        Node<Integer> integerNode_7 = new Node<Integer>(7);
        linkedList.append(integerNode_1);
        linkedList.append(integerNode_2);
        linkedList.append(integerNode_3);
        linkedList.append(integerNode_4);
        linkedList.append(integerNode_5);
        linkedList.append(integerNode_6);
        linkedList.append(integerNode_7);
        linkedList.append(integerNode_3);
        linkedList.printList();

        Integer data = vesselScreen(linkedList);
        if (data != null)
            System.out.println("有环-相交元素为: " + data);
        else
            System.out.println("无环-无相交元素");
    }
}
