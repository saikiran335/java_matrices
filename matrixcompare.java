public class matrixcompare
{
public static void main(String[] args)
{
int i,j;
boolean flag=true;
int a[][]=new int[][]{{1,2,3},
                      {4,5,6},
                      {7,8,9}};
int b[][]=new int[][]{{1,2,3}, 
                      {4,5,6},
                      {7,8,9}};

int rows1=a.length;
int col1=a[0].length;
int rows2=b.length;
int col2=b[0].length;
if(rows1!=rows2||col1!=col2)
{
System.out.println("matrices are not equal");
}
else{
for(i=0;i<rows1;i++)
{
for(j=0;j<col1;j++)
{
if(a[i][j]!=b[i][j])
{
flag=false;
break;
}
}
}
if(flag)
{
System.out.println("matrices are equal");
}
else
{
System.out.println("matrices are not equal");
}
}
}
}