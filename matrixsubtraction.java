public class matrixsubtraction
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
int rows=a.length;
int col=a[0].length;
int res[][]=new int[rows][col];

for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
res[i][j]=a[i][j] - b[i][j];
System.out.print(res[i][j]+ " ");
}


System.out.println();
}
}
}