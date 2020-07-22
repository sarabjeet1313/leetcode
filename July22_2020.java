// zigzag level order traversal - Binary Tree

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        int level = 0;
        
        while(!q.isEmpty()) {
            
            int len = q.size();
            List<Integer> levelSet = new ArrayList<>();
            
            for(int i=0; i < len; i++){
                TreeNode node = q.poll();
                
                if(node.left != null){
                    q.add(node.left);
                }
                
                if(node.right != null){
                    q.add(node.right);
                }
                
                if(level % 2 == 0){
                    levelSet.add(node.val);
                } 
                else {
                    levelSet.add(0, node.val);
                }
            }
            
            result.add(levelSet);
            level++;
        }    
        return result;
    }
}
