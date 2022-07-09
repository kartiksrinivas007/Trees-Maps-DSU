package trees;
public class Node{
    int key;
    Node left, right,parent;
    
    Node (int k){
        this.key = k;
        this.left = null;
        this.right  = null;
        this.parent = null;
    }

}