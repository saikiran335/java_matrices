public class matrixmultiplication
{
public static void main(String[] args)
{
int i,j;
int a[][]=new int[][]{{1,2,3},
                      {4,5,6},
                      {7,8,9}};
int b[][]=new int[][]{{1,2,3}, 
                      {4,5,6},
                      {7,8,9}};
int res[][]=new int[3][3];
int rows=a.length;
int col=a[0].length;


for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
 res[i][j]=0;
for(int k=0;k<3;k++)
{
res[i][j]+=a[i][k] * b[k][j];
}
System.out.print(res[i][j]+ " ");
}


System.out.println();
}
}
}