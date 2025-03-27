#include <stdio.h>

int main()
{
    int ar[30]={0};
    int a=0;
    //과제 낸 사람 체크!
    for(int i=0; i<28; i++){
        scanf("%d", &a);
        ar[a-1] =1;   //배열의 첫번째 인덱스는 0이므로. 또는 위에서 배열을  ar[31] 로 만들고 사용해도 가능.
    }
    //안 낸 사람 체크
    for(int i=0; i<30; i++){
        if (ar[i]==0) printf("%d \n", i+1);
    }
 
    return 0;
}
