package com.yusufsoysal.algorithms.codechallenge.binaryTree;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void shouldReturnTrueForBST(){
        Node root = new Node(4);
        Node node1 = new Node(2);
        Node node2 = new Node(1);
        Node node3 = new Node(3);
        Node node4 = new Node(6);
        Node node5 = new Node(5);
        Node node6 = new Node(7);

        root.left = node1;
        root.right = node4;

        node1.left = node2;
        node1.right = node3;

        node4.left = node5;
        node4.right = node6;

        Assert.assertThat(BinarySearchTree.checkBST(root), CoreMatchers.equalTo(true));
    }

    /*
                    100
                     +
                     |
            40+------+------+130
            +
            |
            |
      20+---+--+120
     */
    @Test
    public void shouldReturnFalseForBST(){
        Node root = new Node(100);
        Node node1 = new Node(40);
        Node node2 = new Node(130);
        Node node3 = new Node(20);
        Node node4 = new Node(120);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        Assert.assertThat(BinarySearchTree.checkBST(root), CoreMatchers.equalTo(false));
    }

    /*
                    100
                     +
                     |
            40+------+------+130
            +                 +
            |                 |
            |                 |
      20+---+--+120      80+--+---+140
     */
    @Test
    public void shouldReturnFalseForBST2(){
        Node root = new Node(100);
        Node node1 = new Node(40);
        Node node2 = new Node(130);
        Node node3 = new Node(20);
        Node node4 = new Node(120);
        Node node5 = new Node(80);
        Node node6 = new Node(140);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        Assert.assertThat(BinarySearchTree.checkBST(root), CoreMatchers.equalTo(false));
    }

}