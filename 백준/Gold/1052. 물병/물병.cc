#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N, K;
    cin >> N >> K;

    int extra = 0; //추가해야하는 물병 수

    //반복
    while (true) {
        //1인 비트 수 검사하기 위한 temp
        int temp = N + extra;

        //현재 물병 개수
        int cnt = 0;

        //1인 비트 수 검사. temp 비트를 밀면서 마지막 비트만 검사 반복
        while (temp>0) {
            if (temp & 1) cnt++;
            temp = temp >> 1;
        }

        //종료 조건. k보다 작거나 같으면 종료
        if (cnt <= K) {
            cout << extra;//출력해야 하는 것 : 최종 물병 개수 x!!! 추가로 산 물병 개수
            break;
        }

        //(추가)조건 만족 못했을 때는
        extra++;

    }
}