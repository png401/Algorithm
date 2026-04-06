#include <iostream>
#include <string>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //M 입력받기
    int M;
    cin >> M;
    int S = 0;

    //명령에 따른 수행 하기
    for (int i=0; i<M; i++) {
        string cmd;
        cin >> cmd;

        if (cmd == "add") {
            int x;
            cin >> x;

            S |= (1<<x);
        }

        else if (cmd == "remove") {
            int x;
            cin >> x;
            S &= ~(1<<x);
        }

        else if (cmd == "check") {
            int x;
            cin >> x;
            
            if (S & (1<<x)) {
                cout << 1 << '\n';
            }
            else cout << 0 << '\n';
        }

        else if (cmd == "toggle") {
            int x;
            cin >> x;
            S ^= (1<<x);
        }

        else if (cmd == "all") {
            S = (1<<21)-2;
        }

        else if (cmd == "empty") {
            S = 0;
        }
    }
    return 0;
}