#include <stdio.h>
#include <string.h>

int main() {
    int N;
    scanf("%d", &N);
    int stack[10000];
    int top = -1;

    for (int i = 0; i < N; i++) {
        char cmd[10];
        scanf("%s", cmd);

        if (strcmp(cmd, "push") == 0) {
            int x;
            scanf("%d", &x);
            stack[++top] = x;
        } 
        else if (strcmp(cmd, "pop") == 0) {
            if (top == -1) printf("-1\n");
            else printf("%d\n", stack[top--]);
        } 
        else if (strcmp(cmd, "size") == 0) {
            printf("%d\n", top + 1);
        } 
        else if (strcmp(cmd, "empty") == 0) {
            printf("%d\n", top == -1 ? 1 : 0);
        } 
        else if (strcmp(cmd, "top") == 0) {
            if (top == -1) printf("-1\n");
            else printf("%d\n", stack[top]);
        }
    }
    return 0;
}