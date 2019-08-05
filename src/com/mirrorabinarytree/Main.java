package com.mirrorabinarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

   public static void main(String[] args) {

      Node a = new Node("A");
      Node b = new Node("B");
      Node c = new Node("C");
      Node d = new Node("D");
      Node e = new Node("E");
      Node f = new Node("F");
      Node g = new Node("G");
      Node h = new Node("H");
      Node i = new Node("I");

      f.left = b;
      f.right = g;
      b.left = a;
      b.right = d;
      d.left = c;
      d.right = e;
      g.right = i;
      i.left = h;

      System.out.println("Before mirroring.");
      inOrder(f);

      Queue<Node> queue = new LinkedList<>();
      queue.add(f);
      while (!queue.isEmpty()) {
         Node tempNode = queue.remove();
         if (tempNode.left != null) {
            queue.add(tempNode.left);
         }

         if (tempNode.right != null) {
            queue.add(tempNode.right);
         }

         swapChildren(tempNode);
      }

      System.out.println("After mirroring.");
      inOrder(f);
   }

   public static void swapChildren(Node root) {
      Node temp = root.left;
      root.left = root.right;
      root.right = temp;
   }

   public static void inOrder(Node root) {
      while (true) {
         if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            root = root.right;
            continue;
         }
         break;
      }
   }
}
