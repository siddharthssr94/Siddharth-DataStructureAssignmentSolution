package com.greatlearning.bstconverter.services;

import com.greatlearning.bstconverter.model.Node;

public class BSTServices {

    public static Node node;
    public static Node prev = null;
    public static Node head = null;

    // Function to to Sort the BST into a skewed tree in increasing order
    public static void CreateRightSkewedBST(Node root)
    {
        // Base Case
        if (root == null) {
            return;
        }

        // Recurse for the left subtree
        CreateRightSkewedBST(root.left);

        // Condition to check if the root Node of the skewed tree is not defined
        if (head == null) {
            head = root;
            root.left = null;
            prev = root;
        } else {
            prev.right = root;
            root.left = null;
            prev = root;

        }

        // Recurse for the right subtree
        CreateRightSkewedBST(root.right);
    }

    // Function to traverse the right skewed tree using recursion
    public static void display(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.getData() + " ");
        display(root.right);
    }
}
