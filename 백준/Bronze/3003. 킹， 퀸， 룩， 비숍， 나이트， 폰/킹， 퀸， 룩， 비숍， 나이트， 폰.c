#include <stdio.h>

int main(){
    int k, q, l, v, kn, p;
    
    scanf("%d %d %d %d %d %d", &k, &q, &l, &v, &kn, &p);
    printf("%d %d %d %d %d %d", 1-k, 1-q, 2-l, 2-v, 2-kn, 8-p);
    
    return 0;
    
}