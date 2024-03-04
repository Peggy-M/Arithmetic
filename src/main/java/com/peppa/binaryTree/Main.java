package com.peppa.binaryTree;

// 测试
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);

        System.out.println("Inorder traversal of binary tree:");
        tree.inorderTraversal();
        System.out.println("===============================");
        PushBinaryTree.preorderTraversal(tree.root);

    }
}