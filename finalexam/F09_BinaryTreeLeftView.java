import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = buildTree(nodes);
        printLeftView(root);
        sc.close();
    }

    static TreeNode buildTree(String[] data) {
        if (data.length == 0 || data[0].equals("-1")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(data[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;

        while (!q.isEmpty() && i < data.length) {
            TreeNode curr = q.poll();
            if (i < data.length && !data[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(data[i]));
                q.offer(curr.left);
            }
            i++;
            if (i < data.length && !data[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(data[i]));
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }

    static void printLeftView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        System.out.print("LeftView: ");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (i == 0) System.out.print(curr.val + " ");
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }
        System.out.println();
    }
}
