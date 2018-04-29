//this code is taken from our teacher's codes to implement our project.
	//We did not started to work on doubly linked list yet.
public class BinarySearchTree {
	
		private NodeTree root;
		private int size;
		
		public BinarySearchTree()
		{
			root= null;
			size= 0;
			}
		//New Node
		private NodeTree createNewNode(int e) {
			
			return new NodeTree(e);
			}
		
		 //getters 
		public int getSize()
		{
			return size;
			
		}
		public NodeTree getRoot() {
			return root;		

	}

}
