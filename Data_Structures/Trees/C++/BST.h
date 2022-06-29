#include "Node.h"
//any inheritance possible ??
template<typename T>
class BST{
    public : 
        Node<T> Root;
        BST();
        BST(T data);
        Node<T>* BST_search(T key);
        bool BST_insert(T key);
        bool BST_delete (T key );
        Node<T>* BST_maximum(Node<T>* subtree_head);
        Node<T>* BST_minimum(Node<T>* subtree_head);
        Node<T>* BST_suc(Node<T>* node);
        Node<T>* BST_pred(Node<T>* node);
        //how to define your own copy constructor etc
};