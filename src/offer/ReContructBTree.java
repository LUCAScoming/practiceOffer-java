package offer;
import java.util.*;


/*输入某二叉树的前序遍历和中序遍历的结果
请重建出该二叉树
假设输入的前序遍历和中序遍历的结果中都不含重复的数字
        例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

        思路：
        我们知道，前序遍历的第一个节点就是树的根节点，所以我们先根据前序遍历序列的第一个数字创建根结点，
        接下来在中序遍历序列中找到根结点的位置，根节点的左边就是左子树，右边就是右子树，这样就能确定左、右子树结点的数量。
        在前序遍历和中序遍历的序列中划分了左、右子树结点的值之后，就可以递归地去分别构建它的左右子树。
        */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class ReContructBTree {



    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    /**
     *
     */
 class Solution {
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            if(pre.length == 0||in.length == 0){
                return null;
            }
            TreeNode node = new TreeNode(pre[0]);//前序遍历的第一个节点为根节点
            for(int i = 0; i < in.length; i++){
                if(pre[0] == in[i]){
                    node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                    node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
                }
            }
            return node;
        }
    }
}
