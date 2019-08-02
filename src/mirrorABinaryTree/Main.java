package mirrorABinaryTree;
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

        f.Left = b;
        f.Right = g;
        b.Left = a;
        b.Right = d;
        d.Left = c;
        d.Right = e;
        g.Right = i;
        i.Left = h;

        InOrder(f);

        Queue<Node> queue = new LinkedList<>();
        queue.add(f);
        while (!queue.isEmpty())
        {
            Node tempNode = queue.remove();
            if (tempNode.Left != null)
            {
                queue.add(tempNode.Left);
            }

            if (tempNode.Right != null)
            {
                queue.add(tempNode.Right);
            }

            SwapChildren(tempNode);
        }

        InOrder(f);
		System.out.println("Hello world!");

	}
    public static void SwapChildren(Node root)
    {
        Node temp = root.Left;
        root.Left = root.Right;
        root.Right = temp;
    }
    
    public static void InOrder(Node root)
    {
        while (true)
        {
            if (root != null)
            {
                InOrder(root.Left);
                System.out.println(root.Data + " ");
                root = root.Right;
                continue;
            }

            break;
        }
    }
}
