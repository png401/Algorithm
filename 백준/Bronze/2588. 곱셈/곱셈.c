#include <stdio.h>

int main(){
    int a, b;
    scanf("%d %d", &a, &b);
    int o = b%10;
    int t = b/10%10;
    int h = b/10/10;
    
    printf("%d\n", a*o);
    printf("%d\n", a*t);
    printf("%d\n", a*h);
    printf("%d\n", a*b);
    
    return 0;
    
}