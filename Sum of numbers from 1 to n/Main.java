import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int i=1;
      int sum=0;
      int x=in.nextInt();
      while(i<=x)
      {
        sum=sum+i;
       i++;
      }
      System.out.println(sum);
	     // Type your code here
	}
}