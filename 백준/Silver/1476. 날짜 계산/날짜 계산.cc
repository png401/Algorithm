#include <iostream>

using namespace std;

int main() {
    //기본 세팅
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    //입력받을 준비
    int E, S, M;
    cin >> E >> S >> M;
    
    //e, s, m, year 1로 초기화(while문 바깥에서 해줘야 함!! 누적돼야 하므로)
    int e=1, s=1, m=1, year = 1;

    while (true) {
        //종료 조건 : ESM과 같아지면 그때의 year값 출력 후 break
        if (e==E && s==S && m==M) {
            cout << year;
            break;
        }
        
        //1씩 더하다가
        e++;
        s++;
        m++;
        year++;
        //각각의 범위 넘으면 다시 1로 리셋
        if (e>15) e=1;
        if (s>28) s=1;
        if (m>19) m=1;
    }
}