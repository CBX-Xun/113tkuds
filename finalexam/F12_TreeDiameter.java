import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static int maxDiameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = buildTree(nodes);
        getHeight(root);
        System.out.println(maxDiameter);
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

    static int getHeight(TreeNode node) {
        if (node == null) return 0;
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }
}
