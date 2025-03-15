class Waste
{
	public static void main(String[] args) 
	{
		int a=1; 
int b=2;
a=b++;
if(2==a){
	b=a+1;
}
else{
	a=b-1;
	while(a>10){
		b=a+b;
		a++;
}
}

		System.out.println("Hello World!"+a+b);
	}
}
