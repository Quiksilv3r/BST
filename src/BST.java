import java.util.*;

public class BST {

	private BSTNode root;
	private int size = 0;

	public BST(BSTNode root) {
		this.root = root;
		size++;
	}


	public void RIC(BSTNode node, int data) {
		
		if(node == null){
			System.err.println("LEAF");
			return;
		} 
		
		if(data < node.getData() && node.getLeftChild() == null){
			BSTNode newNode = new BSTNode(data);
			node.addLeftChild(newNode, data);
			System.out.println("Added left child with value" + data );
			
			return; 
		}
		
		if(data >= node.getData() && node.getRightChild() == null){ 
			BSTNode newNode = new BSTNode(data);
			node.addRightChild(newNode, data);
			System.out.println("Added right child with value" + data );
			return;
		}
		
		if (data > node.getData()){
			RIC(node.getRightChild(),data); 
		}else{
			RIC(node.getLeftChild(),data);
		}	
	}

	public BST BuildTree() {
		
		BST tree = new BST(root);
		Scanner input = new Scanner(System.in);
		int num = 0; 
		
		boolean validInput = true;
		if (root == null) {
			System.out.println("NULL Value!");
			System.exit(0);
		}

		System.out.println("Enter Node Value");

		while(true){
			
			try {
				num = input.nextInt();
				RIC(root,num);
			} catch (InputMismatchException e) {
				break;
			}
		}
			printTree(root);		
	
			return tree;
	}

	public BSTNode printTree(BSTNode curr) {
		if(curr == null){
			//System.out.println("Reached NULL Value");
			return curr; 
		}
			printTree(curr.getLeftChild());
			printTree(curr.getRightChild());
		
			return curr; 
	}
	
	
	public static void main(String [] args) {
		BSTNode root = new BSTNode(5); 
		BST tree = new BST(root); 
		tree.BuildTree();
		tree.printTree(root);
	}
}


// TODO
// DFS
// BFS
// Delete Element at index
// Delete Element at index
// The height of the tree is the height of the tallest subtree + 1
