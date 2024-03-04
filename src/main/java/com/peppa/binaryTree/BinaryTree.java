package com.peppa.binaryTree;

/**
 * 二叉树类
 */
public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    /**
     * @param root 父节点
     * @param val  插入的值
     * @return 返回插入节点的父节点
     */
    private TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertRecursive(root.left, val); // 插入到左节点
        }else{
            root.right=insertRecursive(root.right,val); // 插入到有节点
        }
        return root;
    }

    /**
     * 遍历打印
     */
    public void inorderTraversal(){
        inorderTraversalRecursive(root);
    }

    private void inorderTraversalRecursive(TreeNode root) {
        if(root!=null){
            System.out.println(root.val); //先序遍历
            inorderTraversalRecursive(root.left);
//            System.out.println(root.val); //中序遍历
            inorderTraversalRecursive(root.right);
//            System.out.println(root.val); //后序遍历
        }
    }

}
