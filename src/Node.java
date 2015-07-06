
public abstract class Node {
	private Node [] children; 

	public Node(Node [] children) {
		this.children = children; 
	}
	
	public Node [] getChildren() {
		return children;
	}
	
	public Node getChild(int index) {
		return children[index];
	}
	
	public int getNumChildren() {
		return children.length; 
	}
	
	void addChild(int index, Node n) {
		children[index] = n; 
	}

	void removeChild(int index){
		if(children.length >= 1) {
			children[index] = null; 
		}
	}
}
