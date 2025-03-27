#include <stdio.h>
// 백준 10807
 
int main()
{
   
    int ar[100]={0};
    int N, find;
    int count=0;
    
    scanf("%d", &N);
    
    for(int i=0; i<N; i++){
        scanf("%d", &ar[i]);
    }
    
    scanf("%d",&find);
    
    for(int i=0; i<N; i++){
        if (ar[i]==find) count++;
    }
    printf("%d", count);
}