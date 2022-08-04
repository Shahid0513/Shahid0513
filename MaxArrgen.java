package dsaproblemsolving;
/*3) Get Maximum in Generated Array Leetcode Solution

The problem Get Maximum in Generated Array Leetcode Solution provided us with a single integer. With the given single integer, we need to find the maximum integer in the generated array. The array generation has some rules. Under the imposed co

need to find the maximum integerthat could have been generated. The rules are:

input

n = 7

output

3

Explanation: According to the given rules: nums[0] = 0, nums[1] = 1 nums[(1 * 2) = 2] = nums[1] = 1 nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2 nums[(2 * 2) = 4] = nums[2] = 1 nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3 nums[(3 * 2) = 6] = nums[3] = 2 nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3

So, we can see nums = [0,1,1,2,1,3,2,3], and the maximum is 3 among them. Thus the answer is 3.

Approach for Get Maximum in Generated Array Leetcode Solution

The problem Get Maximum in Generated Array Leetcode Solution has some constraints that must be satisfied. Under the given constraints
that must be satisfied. Under the given constraints, we are required to find the maximum integer. The rules for the array generation have already been explained in the problem’s description. The first method that comes to mind is the generation of array and finding the maximum element. But will that solve the problem?

If we simply went ahead with the generation we won’t be able to find correct results. Because it depends on how we generate the array. If we generate elements at 2ith and (2i+1) index when we are at ith index. At that moment, we would not have the generated value for (i+1)th index. In that case, the result will not be accurate.

To solve the problem, we will manipulate the formulae for element generation. If we replace i with i-1, in the 3rd rule. we find that arr[2*i-1] = arr[i] + arr[i-1]. So, now we can use the rules for array generation. Because this rule uses the value of already generated value. So here instead of using any future unknown values we are using the pre-calculated values. So

*/

public class MaxArrgen {
	
	public static int getMaxArrEle(int n)
	{ 
		
		int arr[] = new int[n+1];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=0;i<n+1;i++)
		{
			if(2*i <= n)
			{
				arr[2 * i] = arr[i];
			}
			if(2 * i + 1 <= n)
			{
				arr[2 * i + 1] = arr[i] + arr[i + 1];
			}
			
		}
		
		int max=arr[0];
				
		for(int i=0;i<=n;i++) 
		{
					
			if(arr[i] > max) 
					 
			{
				max=arr[i];
			}
		}
	      
	return max;
		
		//return max(arr[i], arr[i+1]);
   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=7;
		System.out.println(getMaxArrEle(7));

	}

}
