import java.util.*;
class All_Operators{
	public static void main(String[] args) {
		int a,b,n=0;
		Scanner sc=new Scanner(System.in);

		while(n<6)
		{
			System.out.println("\n\nChoose from Following one");
			System.out.println("1. Arithmetic Operation\n2.Assignment Operation\n3. Relational Operation\n4. Logical Operation\n5.Bitwise Operation ");
			 n=sc.nextInt();

			switch(n)
			{
				case 1:
				
					System.out.println("Enter 1st number");
					a=sc.nextInt();
					System.out.println("Enter 2nd number");
					b=sc.nextInt();

					int c=a+b;

					System.out.println("\n\nAddition is "+c);
					 c=a-b;   //reinitialization
					System.out.println("Substraction is "+c);
					 c=a/b;	//reinitialization
					System.out.println("Division is "+c);
					 c=a*b;	//reinitialization
					System.out.println("Multiplication is "+c);
					 c=a%b;	//reinitialization
					System.out.println("Modulus is "+c);
					break;
				
				case 2:
					System.out.println("Enter 1st number");
					a=sc.nextInt();
					b=a;
					System.out.println("b="+b);
					break;
				case 3:

					System.out.println("Enter 1st number");
					a=sc.nextInt();
					System.out.println("Enter 2nd number");
					b=sc.nextInt();

					boolean k= a<b;
					System.out.println(a+" is less than "+b+": "+k);
					break;
				case 4:

					// System.out.println("Enter 1st number");
					// a=sc.nextInt();
					// System.out.println("Enter 2nd number");
					// b=sc.nextInt();
				
					// boolean l= a&&b;
					// System.out.println(a+" && "+b+" is : "+l);
					break;
				case 5:
					System.out.println("Enter 1st number");
					a=sc.nextInt();
					System.out.println("Enter 2nd number");
					b=sc.nextInt();
				
					int p=a&b;
					System.out.println(a+" & "+b+" is : "+p);
					break;
				default:
					System.out.println("Invalid Choice");
					
			}

		}
	}
}