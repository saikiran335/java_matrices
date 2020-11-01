import java.util.Scanner;
public class Matrixread
{
public static void main(String[] args)
{
int i,j,rows,col;

Scanner sc=new Scanner(System.in);
rows=sc.nextInt();
col=sc.nextInt();
int a[][]=new int[rows][col];

for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=sc.nextInt();
System.out.print("");
}
}

for(i=0;i<rows;i++)
{
for(j=0;j<col;j++)
{
System.out.print(a[i][j] +" ");
}
System.out.println();
}
}
}

