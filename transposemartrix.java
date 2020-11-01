public class transposemartrix
{
public static void main(String[]args)
{
int i,j;
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int rows=a.length;
int col=a[0].length;


int temp[][]=new int[col][rows];
for(i=0;i<col;i++)
{
for(j=0;j<rows;j++)
{
temp[i][j]=a[j][i];
}
}

for(i=0;i<col;i++)
{
for(j=0;j<rows;j++)
{
System.out.print(temp[i][j] + " ");
}
System.out.println();
}
}
}
