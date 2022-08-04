
public class ValidIpAddress {
	
public boolean isvalid( String s)
	
	{
		boolean result = false;
		String sArr[] = s.split("\\.");
		
		for(int i=0; i<sArr.length;i++)
		{
			String str = sArr[i];
			Integer n = Integer.parseInt(str);
			if(n >= 0 && n <= 255)
			{
				result = true;
			}
		}
		
		return result;
	

}
}
