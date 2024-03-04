package com.peppa.binaryTree;

import java.util.Stack;

/**
 * 利用压栈的方式进行树的遍历
 */
public class PushBinaryTree {

    /**
     * 利用栈完成先序遍历
     * @param node 根节点
     */
    public static void preorderTraversal(TreeNode node){
        if(node!=null){
            Stack<TreeNode> stack=new Stack<TreeNode>();
            stack.push(node);
            while (!stack.empty()){
                node=stack.pop();
                System.out.println(node.val);
                if(node.right!=null){
                    stack.push(node.right);
                }
                if(node.left!=null){
                    stack.push(node.left);
                }
            }
        }
    }
}
