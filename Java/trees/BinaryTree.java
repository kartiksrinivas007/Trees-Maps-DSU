package trees;
import java.util.*;
import java.io.*;

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
				
                if(key < x.key){
					System.out.println("Holup " + key + " is smaller than " + x.key);
                    y = x;
                    x = x.left;
          
                }
                else if (key >= x.key) {
					System.out.println("Holup " + key + " is greater than " + x.key);
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
                System.out.println(inserted.key  + " inserted to the left of " + y.key);
            }

        }
    }
    
    public void bfs(){
        //this function will do a breadth first search of the tree most probably;
        //this would need a stack in Java or atleast something similar in nature to it 
        ArrayDeque<Node> bfs_queue  = new ArrayDeque<Node>();
        //problem is that there are no numbers here , so mantaining depth becomes slightly tricky
        bfs_queue.push(root);
        System.out.println("BFS BEGINS");
        while(bfs_queue.size() != 0){
			Node popped = bfs_queue.pop();
			System.out.println(popped.key);
			
			if(popped.left != null){
				bfs_queue.add(popped.left);
				System.out.println(popped.left.key);	
			}
			if(popped.right != null){
				bfs_queue.add(popped.right);
				System.out.println(popped.right.key);
			}
			
		}
	}
	
	public void dfs(){
        //this function will do a breadth first search of the tree most probably;
        //this would need a stack in Java or atleast something similar in nature to it 
        Stack<Node> bfs_stack  = new Stack<Node>();
        ArrayList<Integer> depth = new ArrayList<Integer>(); 
        //problem is that there are no numbers here , so mantaining depth becomes slightly tricky
        bfs_stack.push(root);
        
        while(!bfs_stack.empty()){
			Node popped = bfs_stack.pop();
			System.out.println(popped.key  + " Popped from stack");
			
			if(popped.left != null){
				bfs_stack.push(popped.left);
				System.out.println(popped.left.key  + " Pushed into stack");	
			}
			if(popped.right != null){
				bfs_stack.push(popped.right);
				System.out.println(popped.right.key  + " Pushed into stack");
			}
			
		}
	}
}

