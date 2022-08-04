
 
import java.util.*;
 
public class Main extends UserMainCode{
 
private static Scanner sc;
 
public static void main(String[] args) {

	UserMainCode u = new UserMainCode();
	
	int n;
int[] a = new int[10];
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
boolean s = checkTripplets(a);
if (s)
System.out.println("TRUE");
else
System.out.println("FALSE");
}



 
}