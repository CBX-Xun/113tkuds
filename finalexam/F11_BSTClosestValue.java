import java.util.*;

public class F11_BSTClosestValue {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        int target = sc.nextInt();
        TreeNode root = buildTree(nodes);
        int closest = findClosest(root, target);
        System.out.println(closest);
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

    static int findClosest(TreeNode root, int target) {
        int closest = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(closest - target) ||
               (Math.abs(root.val - target) == Math.abs(closest - target) && root.val < closest)) {
                closest = root.val;
            }
            if (target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return closest;
    }
}
