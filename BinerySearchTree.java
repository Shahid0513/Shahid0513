package TRee;

public class BinerySearchTree {
	public static  void insertNode(Node nodetoinsert , Node rootnode)
	{
		if(nodetoinsert.data < rootnode.data)
		{
			if(rootnode.left == null)
			{
				rootnode.left = nodetoinsert;
				System.out.println("Inserted "+nodetoinsert.data+"  to the left of "+rootnode.data);
			}
			else
			{
				insertNode(nodetoinsert, rootnode.left);
			}
			
		}
		else
		{
			if(rootnode.right == null)
			{
			rootnode.right = nodetoinsert;
			System.out.println("Inserted "+nodetoinsert.data+" to the right of  "+rootnode.data);

			}	
			else
			{
				insertNode(nodetoinsert, rootnode.right);
			}
		}
		
	}
	public static void preOrder(Node rootNode) {
		if(rootNode == null)
			return;
		
		System.out.println(rootNode.data);
		
		preOrder(rootNode.left);
		preOrder(rootNode.right);
					
	}

	public static void postOrder(Node rootNode) {
		if(rootNode == null)
			return;
		
		
		
		postOrder(rootNode.left);
		postOrder(rootNode.right);
		System.out.println(rootNode.data);
					
	}
	
	public static void inOrder(Node rootNode) {
		if(rootNode == null)
			return;
		
		
		
		
		inOrder(rootNode.left);
		System.out.println(rootNode.data);
		inOrder(rootNode.right);
					
	}
	public static int findheight(Node rootnode)
	{
		int leftheight =0;
		int rightheight =0;
		if(rootnode.left != null)
		{
			leftheight = 1+findheight(rootnode.left);
			
		}
		if(rootnode.right != null)
		{
			rightheight = 1 + findheight(rootnode.right);
		}
		return Math.max(leftheight, rightheight);
	}

	
}
