class WoodTable extends WoodFurn
{
int legs=4;
void show()
{
System.out.println("woodtype -"+ type);
System.out.println("finish -"+finish);
System.out.println("legs -"+legs);
}
public static void main(String args[])
{
WoodTable w=new WoodTable();
w.show();
}
}
