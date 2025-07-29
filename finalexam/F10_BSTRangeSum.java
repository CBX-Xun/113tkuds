import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        TreeNode root = buildTree(nodes);
        int sum = rangeSum(root, L, R);
        System.out.println(sum);
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

    static int rangeSum(TreeNode root, int L, int R) {
        if (root == null) return 0;
        int sum = 0;
        if (root.val >= L && root.val <= R) sum += root.val;
        if (root.val > L) sum += rangeSum(root.left, L, R);
        if (root.val < R) sum += rangeSum(root.right, L, R);
        return sum;
    }
}
