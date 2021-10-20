package com.greatlearning.bstconverter.main;

import com.greatlearning.bstconverter.model.Node;
import com.greatlearning.bstconverter.services.BSTServices;

public class Driver {

    public Node node;

    public static void main(String[] args) {

        BSTServices services = new BSTServices();

        Driver tree = new Driver();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.left.right = new Node(40);

        System.out.println("\nRight Skewed BST is : ");

        //Convert BST into right Skewed BST
        services.CreateRightSkewedBST(tree.node);

        //Display Skewed Tree
        services.display(services.head);
    }
}