#ifndef NODE_H
#define NODE_H

#include<iostream>

template<typename T>
class Node{
	public :
		T data;
		Node* left;
		Node* parent;
		Node* right;
		Node(T dat);
		Node();
		
	
};

template<typename T>
Node<T>::Node(T dat){
    data = dat;
    left = NULL;
    right = NULL;

}

#endif
