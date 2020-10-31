public class lowertriangularmatrix
{
public static void main(String[] args)
{
int i,j;

int a[][]=new int[][]{{1,2,3},
                      {4,5,6},
                      {7,8,9}};
int rows=a.length;
int col=a[0].length;
if(rows!=col)
{
System.out.println("it should be squarematrix");
}
else{
for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
if(j>i)
{
System.out.print("0 ");
}
else
{
System.out.print(a[i][j]+ " ");
}
}
System.out.println();
}
}
}
}