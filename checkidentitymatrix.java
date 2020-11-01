public class checkidentitymatrix
{
public static void main (String [] args)
{
int i,j;
boolean flag=true;
int a[][]={{1,0,0},{0,1,0},{0,0,1}};
int rows=a.length;
int col=a[0].length;

if(rows!=col)
{
System.out.println("expecting square matrix!");
}
else
{
for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
if(i!=j && a[i][j]!=0)
{
flag=false;
break;
}
if(i==j && a[i][j]!=1)
{
flag=false;
break;
}
}
}

if(flag)
{
System.out.println("it is an identity matrix");
}
else
{
System.out.println("it is not an identity matrix");
}
}
}
}