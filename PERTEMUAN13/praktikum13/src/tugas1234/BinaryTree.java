/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1234;

/**
 *
 * @author LENOVO IDP 110
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
        
    }
     boolean isEmpty(){
         return root == null;
         
     }
 
     void add(int data){
         if (isEmpty()) {
             root = new Node(data);
         } else {
             Node current = root;
             while(true){
                 if (data<current.data) {
                     if(current.left!=null){
                         current= current.left;
                         break;
                     }else{
                         current.left= new Node(data);
                         break;
                     }
                 } else if(data >current.data) {
                     if (current.right!=null) {
                         current= current.right;
                     } else {
                         current.right=new Node(data);
                         break;
                     }
                 }else{
                     break;
                 }
             }
         }
     }
    boolean find(int data){
        boolean hasil= false;
        Node current = root;
        while(current!= null){
            if (current.data ==data) {
                hasil= true;
                break;
            }else if(data<current.data){
                current=current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
void traversePreOrder(Node node){
    if(node != null){
        System.out.println(" "+ node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

void traversePostOrder(Node node){
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.println(" "+node.data);
    }
}

void traverseInOrder(Node node){
    if (node != null){
        traverseInOrder(node.left);
        System.out.println(" "+ node.data);
        traverseInOrder(node.right);
    }
}
Node getSuccessor(Node del){
 Node successor = del.right;
 Node successorParent = del;
 while(successor.left!=null){
     successorParent = successor;
     successor = successor.left;
 }
    if (successor!=del.right) {
        successorParent.left = successor.right;
        successor.right=del.right;
    }
    return successor;
}

void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChiled = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChiled = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChiled = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left == null && current.right == null ){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChiled){
                        parent.left = null;   
                    }else{
                        parent.right = null;
                    }  
                }
            }else if(current.left == null){//if there is 1 child (right)
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChiled){
                        parent.left = current.right;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else if(current.right == null){//if there is 1 child (left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChiled){
                        parent.left = current.left;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else{//if there is 2 childs
                Node successor = getSuccessor(current);
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChiled){
                        parent.left = successor;   
                    }else{
                        parent.right =successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    void addRekursif(int data){
    root = rekursif(root, data);
}
    Node rekursif(Node root, int data) {
    if (root == null) {
    root = new Node(data);
    return root;
}
if (data < root.data)
root.left = rekursif(root.left, data);
else if (data > root.data)
root.right = rekursif(root.right, data);
return root;
}
    int min(Node node) {
        if (node == null) {
        System.out.println("Tree Empty");
        return 0;
        }
        while (node.left != null) {
        node = node.left;
        }
        return node.data;
        }
        int max(Node node) {
        if (node == null) {
        System.out.println("Tree Empty");
        return 0;
        }
        while (node.right != null) {
        node = node.right;
        }
        return node.data;
        }
        
         void dataLeaf(Node node){
    if (node == null) {
    return;
}
    if (node.left == null && node.right == null) {
    System.out.println("leaf : " + node.data);
    }else{
    if (node.left != null) {
    dataLeaf(node.left);}
    if (node.right != null) {
    dataLeaf(node.right);
    }
    }
         }
    int jmlLeaf(Node node) {
if (node == null) {
return 0;
}
if (node.right == null && node.left == null) {
return 1;
} else {
return jmlLeaf(node.left) + jmlLeaf(node.right);
}
}

    

}
