
//this code is taken from our teacher's codes to implement our project.
	//We did not started to work on doubly linked list yet.

public class NodeTree {
	private int element;
	private NodeTree left;
	private NodeTree right;
	
	
	 /* Constructor */
	public NodeTree(int newElement) 
		{
		element= newElement;
		left= null;
		right= null;
		
		}
	
	 //getters and setters
    /* Function to set link to next node */
	public int getElement()
		{
		
		return element;
		}
	
	public void setElement(int newElement)
		{ 
		element= newElement;
		
		}
	
	public NodeTree getLeft(){
		return left;
		}
	public void setLeft(NodeTree newLeft){
		left= newLeft;
		}

	public NodeTree getRight(){
		return right;
		}
	public void setRight(NodeTree newRight){
		right= newRight;
}

}
