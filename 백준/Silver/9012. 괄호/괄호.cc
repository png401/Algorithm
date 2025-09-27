#include <stdio.h>
#include <string.h>

#define MAX 51   // 괄호 문자열 최대 길이 (문제 조건: 50)

int main() {
    int T;
    scanf("%d", &T);

    while (T--) {
        char str[MAX];
        scanf("%s", str);

        int stack[MAX];
        int top = -1;
        int valid = 1; // 올바른지 체크

        for (int i = 0; i < strlen(str); i++) {
            if (str[i] == '(') {
                stack[++top] = '(';  // push
            } else { // ')'
                if (top == -1) {    // 스택 비었는데 pop 시도
                    valid = 0;
                    break;
                } else {
                    top--;          // pop
                }
            }
        }

        // 끝났는데도 스택이 비어있지 않다면 잘못된 괄호열
        if (valid && top == -1)
            printf("YES\n");
        else
            printf("NO\n");
    }
    return 0;
}
