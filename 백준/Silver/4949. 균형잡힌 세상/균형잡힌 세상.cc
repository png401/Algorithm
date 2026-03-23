#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() {
    //4949 백준
    //괄호가 [, ( 면 스택에 집어넣고
    //괄호가 ],)면 스택에 들어있는지 확인
    string s;
    while (true) {
        getline(cin, s);
        //이 안에서 문자열 입력 받고.. 언제 끝날 지 모르니까
        if (s==".") break; //온점만 있으면 끝
        stack <char> st;
        bool balanced = true;
        for (char c : s) {
            //c가 (면 stack에 집어넣음
            //[ 여도 stack에 push
            //)면 stack st.top이 [ 거나, 비어있으면 break; for문 빠져나와서 balanced 변수를 false로 놓고, no 출력
            //]면 stack st.top이 (거나, 비어있으면 break; balanced false no 출력
            //for문 끝났는데도 st.empty() 가 아니어도 balanced = false, no 출력
            //이외에는 다 yes 출력
            if (c=='(' || c=='[') st.push(c);

            else if (c==')') {
                if (st.empty() || st.top()=='[')
                {
                    balanced = false;
                    break;
                }
                st.pop();
            }

            else if (c==']') {
                if (st.empty() || st.top()=='(')
                {
                    balanced = false;
                    break;
                }
                st.pop();
            }
        }
        //while문 끝났을 때는 전체 입력 끝난 것. 각 문장마다 yes or no 출력해야 되니 while문 끝나기 전에 코드 쓰기
        if (!st.empty()) balanced = false;

        if (balanced == true) cout<<"yes\n";
        else cout<<"no\n";
    }
}