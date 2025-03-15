class Ex10{
public static void main (String []args) {
int newmulti[][] = new int[3][];
newmulti [0] = new int[3];
newmulti [1] = new int[5];
newmulti [2] = new int[7];
for (int i = 0; i < newmulti.length; i++) {
System.out.println ("\n\n");
for (int j = 0; j < newmulti[i].length;
j++) {
newmulti[i][j]=i*j;
}
}
for (int i = 0; i < newmulti.length; i++) {
System.out.println ("\n\n");
for (int j = 0; j < newmulti[i].length; j++)
{
System.out.print ("newmulti["+i+"]["+j+"] = "+newmulti[i][j]+"\t");
}
}
}
}
