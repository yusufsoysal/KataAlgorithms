package com.yusufsoysal.algorithms.codechallenge.binaryTree;

public class BinarySearchTree {

    public static boolean checkBST(Node node){
        return check(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean check(Node node, int min, int max){
        if(node == null){
            return true;
        }

        if( node.data <= min || node.data >= max ) {
            return false;
        }

        return check(node.left, min, node.data) && check(node.right, node.data, max);
    }
}
