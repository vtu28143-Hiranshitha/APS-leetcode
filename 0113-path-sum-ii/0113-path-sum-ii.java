class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void findPaths(TreeNode root, int sum, List<Integer> path,
                           List<List<Integer>> result) {
        if (root == null) return;

        path.add(root.val);
        sum -= root.val;

        if (root.left == null && root.right == null && sum == 0) {
            result.add(new ArrayList<>(path));
        } else {
            findPaths(root.left, sum, path, result);
            findPaths(root.right, sum, path, result);
        }

        path.remove(path.size() - 1);
    }
}