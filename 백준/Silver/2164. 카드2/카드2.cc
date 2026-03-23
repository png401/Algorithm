#include <iostream>
#include <queue>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    queue <int> q;
    int N;
    cin>>N;

    for (int i=1; i<=N; i++) {
        q.push(i);
    }

    while (true) {
        if (q.size()==1) break;
        //버려
        q.pop();

        //꺼내서 끝으로 집어넣어
        int a = q.front();
        q.pop();
        q.push(a);
    }

    cout<<q.front();
}
