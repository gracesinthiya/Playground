import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int i,fact=1;
      int n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
      
        // Type your code here
	}
}