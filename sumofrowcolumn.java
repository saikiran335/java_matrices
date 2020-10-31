public class sumofrowcolumn
{
public static void main(String[] args)
{
int i,j;

int a[][]=new int[][]{{1,2,3},
                      {4,5,6},
                      {7,8,9}};
int rows=a.length;
int col=a[0].length;
for(i=0;i<rows;i++)
{
int rowsum=0;
for(j=0;j<col;j++)
{
rowsum+=a[i][j];
}
System.out.println("row"+(i+1)+"sum = "+ rowsum);
}
for(i=0;i<col;i++)
{
int colsum=0;
for(j=0;j<rows;j++)
{
colsum+=a[j][i];
}
System.out.println("col"+(i+1)+"sum = "+ colsum);
}
}
}
