#include <iostream>
#include <stack>
#include <string>

using namespace std;

//연산자들 우선순위 정해주고
int priority(char ch) {
    if (ch=='*'||ch=='/') return 2;
    if (ch=='-'||ch=='+') return 1;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    stack <char> st;


    //입력 받고
    string s;
    cin >> s;

    for (char ch : s) {
        //피연산자면 그대로 출력하기
        if (ch>='A' && ch<='Z') {
            cout << ch;
        }

        //연산자면 스택에 넣는데, while 조건에 따라 pop하기
        else if (ch=='*' || ch=='/' || ch=='+' || ch=='-') {
            //연산자 우선순위가 st.top()>= 들어오려는 애 : 다 pop 하기
            while (!st.empty() && priority(st.top()) >= priority(ch) && st.top()!='(') {
                cout << st.top();
                st.pop();
            }
            //이후 들어올 수 있음
            st.push(ch);
        }

        //이제 괄호 해결하기
        //(면 무조건 push
        //)면 ( 보일 때까지 다 pop
        else if (ch=='(') st.push(ch);
        else /*if (ch==')')*/ {
            while (!st.empty() && st.top()!='(') {
                cout<<st.top();
                st.pop();
            }
            st.pop(); //(도 pop하기
        }
    }

    while (!st.empty()) {
        cout << st.top();
        st.pop();
    }

    return 0;

    //피연산자면 그냥 그대로 출력하기

    //연산자면 스택에 넣는데,
    //우선순위가 st.top() >= 들어오려는 애 이면 안에 있는 걸 다 pop하고, 이후에 들어올 수 있다.
}