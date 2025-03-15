class dohwile1
{
        public static void main(String ar[])
        {
                int n,a,b,c;
                n=15;
                System.out.println("We going to Generate " +n+ " terms");
                a=-1;
                b=1;
                do
                {
                        c=a+b;
                        a=b;
                        b=c;
                        n=n-1;
                        System.out.print(" "+c);
                  }
                  while(n>=1);
         }
}
