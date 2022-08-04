package TRee;
import java.util.*;
public class BSTDemo {
//	input
//	root node 8
//	element
//	3 10 1 6 14 4 7 13 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the root node values");
		
		int rootdata = sc.nextInt();
		Node rootnode = new Node(rootdata);
		
		System.out.println("how many nodes you want to insert");
		
		int n = sc.nextInt();
		System.out.println("enter "+ n+"nodes data");
		for(int i =0;i<n;i++)
		{
			int data = sc.nextInt();
			Node nodeToInsert = new Node(data);
			BinerySearchTree.insertNode(nodeToInsert, rootnode);
			
		}
		System.out.println("PreOrder Traversal");
		BinerySearchTree.preOrder(rootnode);
		
		System.out.println("PostOrder Traversal");
		BinerySearchTree.postOrder(rootnode);
		
		System.out.println("InOrder Traversal");
		BinerySearchTree.inOrder(rootnode);
		
		System.out.println("Height of the Tree or Depth of the Tree: "
				+ BinerySearchTree.findheight(rootnode));
		
	}

}
