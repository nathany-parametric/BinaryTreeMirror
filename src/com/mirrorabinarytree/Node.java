package com.mirrorabinarytree;

public class Node {
    public String data;
    public Node left, right;

    public Node(String item)
    {
    	data = item;
    	left = null;
    	right = null;
    }
}