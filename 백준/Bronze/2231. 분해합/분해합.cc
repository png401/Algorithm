#include <iostream>

using namespace std;

int main() {
    cin.tie(NULL);
    cout.tie(NULL);

    int N;
    cin>>N;

    for (int i=1; i<=N; i++) {
        int x=i;
        int sum=i;
        while (x>0) {
            sum += x % 10;
            x /= 10;
        }
        if (sum == N)
        {
            cout<<i;
            return 0;
        }
    }

    cout<<0;
}