#include <iostream>
#include <vector>
#include <stack>

using namespace std;

int main() {
    int N;
    cin >> N;
    vector <int> A(N);
    stack <int> st;
    vector <int> result(N, -1);

    //배열에 입력받기
    for (int i=0; i<N; i++) {
        cin >> A[i];
    }

    //조건에 맞춰서 pop, push는 일단 다 받기
    for (int i=0; i<N; i++) {
        while (!st.empty() && A[st.top()]<A[i]) {
            //st.top() 인덱스의 오큰수 = A[i]
            result[st.top()] = A[i];
            st.pop();
        }
        st.push(i);
    }

    //result 결과 출력
    for (int i=0; i<N; i++) {
        cout << result[i] << " ";
    }
}