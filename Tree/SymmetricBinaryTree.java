
public class SymmetricBinaryTree {
    public int isSymmetric(TreeNode A) {
        if(check(A.left,A.right)) return 1;
        return 0;
    }
    boolean check(TreeNode a,TreeNode b){
        if(a==null&&b==null) return true;
        if(a==null || b==null ) return false;
        return (a.val==b.val && check(a.left,b.right) && check(a.right,b.left));
    }
}
