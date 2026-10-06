class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    private boolean mirror(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        return (p.val == q.val)
                && mirror(p.left, q.right)
                && mirror(p.right, q.left);
    }
}