package trees;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }
    public BinaryTree(int key){
        root = new Node(key);
    }
    public void Insert(int key){
        if(root == null){
            root = new Node(key);
        }
        else{
            Node x = root;
            Node y = null;

            while (x!= null){
                if(x.key < root.key){
                    y = x;
                    x = x.left;
                }
                else if (x.key >= root.key) {
                    y = x; 
                    x = x.right;
                }
            }

            Node inserted = new Node(key);
            if(key >= y.key){
                inserted.parent = y;
                y.right = inserted;
            }
            else{
                inserted.parent = y;
                y.left = inserted;
            }

        }
    }
}
