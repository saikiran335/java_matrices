public class evenoddfrquencymatrix
{
public static void main(String[] args)
{
int i,j;

int a[][]=new int[][]{{1,2,3},
                      {4,5,6},
                      {7,8,9}};
int rows=a.length;
int col=a[0].length;
int evencount=0;
int oddcount=0;
for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
if(a[i][j]%2==0)
{
evencount++;
}
else
{
oddcount++;
}
}
}
System.out.println("frequency of even numbers in matrix:"+evencount);
System.out.println("frequency of odd numbers in matrix:"+oddcount);
}
}