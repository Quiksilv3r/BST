
public class BSTNode {
	
	private BSTNode leftChild; 
	private BSTNode rightChild; 
	String branch = "";
	private int data; 
	
	public BSTNode(int data){
		//super(children);
		this.leftChild = null;
		this.rightChild = null; 
		this.data = data; 
	}

	void addLeftChild( BSTNode leftAdd, int data) {
		leftAdd.data = data; 
		leftChild = leftAdd; 
	}
	
	void addRightChild(BSTNode rightAdd, int data) {
		rightAdd.data = data; 
		rightChild = rightAdd; 
	}
	
	void removeLeftChild(BSTNode curr) {
		curr.leftChild = null;
	}
	
	void removeRightChild(BSTNode curr) {
		curr.rightChild = null;
	}
	
	public BSTNode getLeftChild() {
		
		if(leftChild != null) {
			return leftChild;
		}
		return null; 
	}
	
	public BSTNode getRightChild() {
		
		if(rightChild != null) {
			return rightChild;
		}
		return null; 
	}
	
	public void  setData(int d){
		data = d;
	}
	
	public int getData() {
		return data;
	}
	
	public void changeNodeData(int d) {
		data = d;
	}
}