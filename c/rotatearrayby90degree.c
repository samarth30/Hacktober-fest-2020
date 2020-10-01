#include <stdio.h>
/* Include other headers as needed */
int main()
{
int a,i,j;
  scanf("%d",&a);
  while(a--)
  {
    int m;
    scanf("%d",&m);
    int arr[m][m];
    for(i=0;i<m;i++)
    {
      for(j=0;j<m;j++){
        scanf("%d",&arr[i][j]);
      }
    }
    for(j=0;j<m;j++)
    {
      for(i=m-1;i>=0;i--)
      {
        if(i!=0)
        {
          printf("%d ",arr[i][j]);
        }
        else{
           printf("%d",arr[i][j]);
        }
      }
      printf("\n");
    }
    printf("\n");
  }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}