class while1
{
        public static void main(String ar[])
        {
                int num,c,d;
                num=525123;
                c=0;
                System.out.println("Given number = "+num);
                while(num>0)
                {
                        d=num%10;
                        c=(c*10)+d;
                        num=num/10;
                }
                System.out.println("Reversed number = "+c);
          }
}
