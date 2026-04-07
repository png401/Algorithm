#include <iostream>

using namespace std;

int main() {
    int N, K;
    cin >> N >> K;

    //추가로 사야 하는 물병 개수 - 전체에서 누적해서 출력해야 하므로 여기서 초기화
    int extra = 0;

    //반복
    while (true) {
        //끝 비트 수 검사하기 위한 임시값
        int temp = extra + N;
        //현재 물병 개수(1인 비트 수 세기 위한 값)
        int cnt = 0;
        
        //temp 비트 검사하기
        while (temp > 0) {
            if (temp & 1) cnt++;
            temp = temp >> 1;
        }
        
        //while 반복 종료 조건 : cnt K
        if (cnt <= K) {
            //추가한 물병만 출력
            cout << extra;
            break;
        }
        
        //종료 실패했으면 물병 하나 더 추가
        extra++;
    }
}