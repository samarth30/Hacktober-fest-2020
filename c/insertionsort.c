#include <stdio.h>
/* Include other headers as needed */
int main()
{int a;
 scanf("%d",&a);
 while(a--)
 {
   int n,c=0,i,j,temp,key,flag=0;
   scanf("%d",&n);
   int arr[n];
   for(i=0;i<n;i++)
   {
     scanf("%d",&arr[i]);
   }
  for(i=1;i<n;i++)
  {
    key=arr[i];
    for(j=i-1;j>=0;j--)
    {
      if(arr[j]>key)
      {
        arr[j+1]=arr[j];
        flag=1;
        c++;
      }
    }
    if(flag==1){
      arr[j+1]=key;
      c++;
    }
   flag=0; 
  }
   printf("%d\n",c);
  
 }

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}