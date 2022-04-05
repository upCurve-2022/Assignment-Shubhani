package challenges;

public class q17 {
    static class Node{
        public String data;
        public Node left, right;
    }
    static void printNode(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }

        if (root.left != null) {
            printNode(root.left);
        }
        if (root.right != null) {
            printNode(root.right);
        }
    }
    static Node newNode(String data){
        Node temp = new Node();
        temp.data = data;
        temp.left=null;
        temp.right=null;
        return temp;
    }

    public static void main(String[] args) {
        Node root = newNode("A");
        root.left = newNode("B");
        root.left.left = newNode("C");
        root.left.right = newNode("E");
        root.left.left.left = newNode("D");
        root.right = newNode("F");
        root.right.right = newNode("H");
        root.right.left = newNode("G");
        root.right.right.right = newNode("K");

        printNode(root);
    }
}
