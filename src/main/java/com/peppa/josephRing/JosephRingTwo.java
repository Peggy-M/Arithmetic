package com.peppa.josephRing;

import com.peppa.common.LinkedList;
import com.peppa.common.Node;

import static com.peppa.josephRing.JosephRing.getLopNode;

/**
 * 题目:
 * 给定一个可能有环也可能无环的单链表，头结点 head1 和 head2。
 * 请实现一个函数,如果两个链表相交，请返回相交的 第一个节点 。如果不相交，返回 null
 * 【要求】
 * 如果两个链表的长度之和为 N ，时间复杂度请达到 O(N) , 额外空间复杂度请达到 O(1) 。
 */
public class JosephRingTwo {
    /*
    关于思路一:
        还是采用容器的方法,在之前将其中一个链表遍历完，再去遍历另一条链表，如果两个链表相交。
        必定在容器当中存在该节点，而该节点就是入环节点。
        代码与之前的一样
     */
    /*
    关于思路二:
        需要分三种情况进行研究
        第一种，两个链表的节点都是无环;
            两个链表都是无环的分别遍历两个链表,直到最后一个节点。如果两个链表是相交的,那么直到最后一个节点,两个链表的最后的节点必定指向的是同一个节点。
            确定相交的节点,则只需要确定两个链表的长度，让两个链表中的长链表先走两个链表的差值步,让后在此基础上同时遍历两个链表，直到两个链表的指针指向同一个节点，该节点就是相交节点。
        第二种，一个链表有环，一个链表无环;
            这种情况下，两个链表永远不可能相交。一个已经形成环，另一个是单链表。
        第三种，两个链表都是有环存在的;
            两个链表都存在环则表示
     */


    /**
     * 获取到结束节点的当前链表长度
     *
     * @param headNode
     * @param endNode
     * @param <E>
     */
    public <E> int getLengthByEndNode(Node<E> headNode, Node<E> endNode) {
        int length = 0;
        Node node = headNode;
        while (node != endNode) {
            node = node.next;
            length++;
        }
        return length;
    }

    /**
     * 判断两个链表是否相交,如果相交返回相交的第一个节点，如果不想交返回 null
     *
     * @param nodeA
     * @param nodeB
     * @param <E>
     * @return
     */
    public static <E> Node noLoop(Node<E> nodeA, Node<E> nodeB) {
        if (nodeA == null || nodeB == null) return null;
        Node curA = nodeA;
        Node curB = nodeB;
        int n = 0;
        while (curA != null) {
            n++;
            curA = curA.next;
        }
        while (curB != null) {
            n--;
            curB = curB.next;
        }
        if (curA != curB) return null;
        curA = n > 0 ? nodeA : nodeB; //两链表谁长，谁就作为头节点
        curB = curA == nodeA ? nodeB : nodeA; //如果 curA 是指向 nodeA ,那就 curB 就指向 nodeB ，否则相反;
        n = Math.abs(n); //两个链表相差的步数
        while (n != 0) {
            n++;
            curA = curA.next;
        }
        while (curA != curB) { //直到两链表首次相遇
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }

    /**
     * 两个有环链表，返回第一个相交节点，如果不相交返回 null
     *
     * @param headA 链表A 头节点
     * @param loopA 入环节点 A
     * @param headA 链表B 头节点
     * @param loopB 入环节点 B
     * @return 相交返回相交节点 不相交返回 null
     */
    public static <E> Node bothLoop(Node<E> headA, Node<E> loopA, Node<E> headB, Node<E> loopB) {
        Node cur1 = null;
        Node cur2 = null;
        if (loopA == loopB) { //入环节点相同,采用链表相交的判断方式【长链表先走,短链表再走】
            cur1 = headA;
            cur2 = headB;
            int n = 0;
            while (cur1 != loopA) { //直到尾节点相遇
                n++;
                cur1 = cur1.next;
            }
            while (cur2 != loopB) {
                n--;
                cur2 = cur2.next;
            }
            cur1 = n > 0 ? headA : headB;
            cur2 = cur1 == headA ? headB : headA;
            Math.abs(n);
            while (n != 0) { //长链表先走差值步骤
                cur1 = cur1.next;
                n--;
            }
            while (cur2 == cur1) { //一起开始,直到相遇
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        } else { //如果 链表A 与 链表 B 的入环节点不一样.就会出现两种情况
            cur1 = loopA;
            while (cur1 != loopA) {
                if (cur1 == loopB) {
                    return loopA; // //[情况2 两个有环链表相交，并且入环节点不同]
                }
                cur1 = cur1.next;
            }
            // [情况1 两个有环链表不相交]
            return null;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedListA = new LinkedList<Integer>();
        LinkedList<Integer> linkedListB = new LinkedList<Integer>();
        Node<Integer> integerNode = new Node<Integer>(10);

        Node<Integer> integerNode_A_1 = new Node<Integer>(1);
        Node<Integer> integerNode_A_2 = new Node<Integer>(2);
        Node<Integer> integerNode_A_3 = new Node<Integer>(3);
        Node<Integer> integerNode_A_4 = new Node<Integer>(4);
        Node<Integer> integerNode_A_5 = new Node<Integer>(5);
        Node<Integer> integerNode_A_6 = new Node<Integer>(6);
        Node<Integer> integerNode_A_7 = new Node<Integer>(7);
        linkedListA.append(integerNode_A_1);
        linkedListA.append(integerNode_A_2);
        linkedListA.append(integerNode_A_3);
        linkedListA.append(integerNode_A_4);
        linkedListA.append(integerNode_A_5);
        linkedListA.append(integerNode_A_6);
        linkedListA.append(integerNode_A_7);
        linkedListA.append(integerNode);
        linkedListA.printList();

        Node<Integer> integerNode_B_1 = new Node<Integer>(1);
        Node<Integer> integerNode_B_2 = new Node<Integer>(2);
        Node<Integer> integerNode_B_3 = new Node<Integer>(3);
        Node<Integer> integerNode_B_4 = new Node<Integer>(4);
        Node<Integer> integerNode_B_5 = new Node<Integer>(5);
        Node<Integer> integerNode_B_6 = new Node<Integer>(6);
        Node<Integer> integerNode_B_7 = new Node<Integer>(7);
        linkedListB.append(integerNode_B_1);
        linkedListB.append(integerNode_B_2);
        linkedListB.append(integerNode_B_3);
        linkedListB.append(integerNode_B_4);
        linkedListB.append(integerNode_B_5);
        linkedListB.append(integerNode_B_6);
        linkedListB.append(integerNode_B_7);
        linkedListB.append(integerNode);
        linkedListB.printList();

        Node node = noLoop(integerNode_A_1, integerNode_B_1);
        System.out.println(node);
    }
}
