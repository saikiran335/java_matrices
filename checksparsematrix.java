public class checksparsematrix
{
public static void main (String [] args)
{
int i,j;
int count =0;
int a[][]={{1,0,0},{0,1,0},{0,0,1}};
int rows=a.length;
int col=a[0].length;


int size=rows* col;

for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
if(a[i][j]==0)
{
count++;
}
}
}
if(count>(size/2))
{
System.out.println("is a sparse matrix");
}
else
{
System.out.println("is not a sprase matrix");
}
}
}