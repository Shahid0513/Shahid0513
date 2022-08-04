package dsaproblemsolving;
import java.util.*;
public class StackD {
	
	public static String topmostStack(int N,String[] A)
	  {
	    String result="";
	    String S="";
	    Stack<String> st=new Stack<>();
	    for(int i=0;i<N;i++){
	    st.push(A[i]);
	    }
	    
	    //Stack<String> st1=new Stack<>();
	    if(st.isEmpty())
	    	return "-1";
	  for(int i=0;i<N;i++)
	  {
		  
	   //S=st.peek();
//	 if(S.charAt(0)=='a' || S.charAt(0)=='e' || S.charAt(0)=='i' || S.charAt(0)=='o' || S.charAt(0)=='u'  ){
	 //      st.pop();
	       }
	     
	  result+=st.peek();
	     return result;
	  }
	  public static void main (String[]args)
	  {
	    Scanner sc = new Scanner (System.in);

	   
	    int N = sc.nextInt ();

	    String[] A = new String[N];
	    for (int i = 0; i < N; i++)
	    {
	        A[i] = sc.next();
	    }
	    
	    sc.close ();

	    
	    System.out.print(topmostStack(N,A));
	  }

}
