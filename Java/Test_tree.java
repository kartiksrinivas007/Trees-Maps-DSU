import trees.*;
import java.io.*;
import java.util.*;
public class Test_tree{
    public static void main(String[] args){
        BinaryTree bst = new BinaryTree(5);
        bst.Insert(6);
        bst.Insert(7);
        bst.Insert(8);
        bst.Insert(4);
        System.out.println("Reached Succesfully!");
        bst.dfs();
        bst.bfs();
    }
}
