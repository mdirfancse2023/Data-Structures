import java.util.*;

class BinarySearchTree{
	ArrayList<Integer> arr = new ArrayList<>();
	
	//Node Template
	Node root;
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left=right=null;
		}
	}
	
	//Node Insertion
	void insert(int data) {
		arr.add(data);
		root = insertrec(root,data);
	}
	Node insertrec(Node root , int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left = insertrec(root.left,data);
		}
		else if(data>root.data) {
			root.right = insertrec(root.right,data);
		}
		return root;
	}
	
	//Node Printing
	void inorder()
    {
         inorderRec(root);
         System.out.println();
    }
	void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + "->");
            inorderRec(root.right);
        }
    }
	void preorder()
    {
         preorderRec(root);
         System.out.println();
    }
	void preorderRec(Node root)
    {
        if (root != null) {
        	System.out.print(root.data + "->");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
	void postorder()
    {
         postorderRec(root);
         System.out.println();
    }
	void postorderRec(Node root)
    {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + "->");
        }
    }
	void levelOrder() {
		int h = height(root);
		for(int i = 1 ; i <= h ; i++) {
			levelOrder(root,i);
		}
		System.out.println();
	}
	void levelOrder(Node root,int level) {
		if (root == null)
            return;
		else if(level == 1)
            System.out.print(root.data + "->");
        else{
            levelOrder(root.left, level - 1);
            levelOrder(root.right, level - 1);
        }
	}
	
	//Node Search
	void search(int val) {
		System.out.println(searchRec(root,val));
	}
	
	Node searchRec(Node root, int val)
	{
	    if (root==null || root.data==val)
	        return root;
	    if (root.data < val)
	       return searchRec(root.right, val);
	    return searchRec(root.left, val);
	}
	
	//Node Delete using Collections
	void delete(int val) {
		root = null;
		int n = arr.size();
		for(int i = 0 ; i < n ; i++) {
			int x=arr.remove(0);
			if(x==val) {
				
			}
			else {
				insert(x);
			}
		}
	}
	
	//Height of a Tree
	void height() {
		System.out.println(height(root));
	}
	int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            return (rheight + 1);
        }
    }
}
public class BinarySearchTreeDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(23);
		bst.insert(56);
		bst.insert(17);
		bst.insert(25);
		bst.insert(30);
		
		
		bst.delete(21);
		bst.inorder();
		bst.preorder();
		bst.postorder();
		bst.search(6);
		bst.levelOrder();
		bst.height();
		//System.out.println(bst.arr);
		

	}

}
