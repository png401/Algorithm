#include <iostream>
#include <vector>
using namespace std;

int main() {
    //n 입력받기
    int n;
    cin >> n;

    //2차원 배열 선언하기
    vector<vector<int>> ground (n, vector<int>(n));

    //for문으로 배열 입력받기
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            cin >> ground[i][j];
        }
    }

    //처음엔 정답값(최소 비용) 최대로 키워놓기
    int answer = 200*3*5;

    //n은 테두리 못가도록 n-2로 변경
    n -= 2;

    //꽃 3개 위치 위한 r1,c1,r2,c2... 선언
    int r1, c1, r2, c2, r3, c3;

    //이제 본격 삼중 for문 돌리기
    for (int i=0; i<n*n; i++) {
        r1 = i/n + 1;
        c1 = i%n + 1;

        for (int j=0; j<n*n; j++) {
            r2 = j/n + 1;
            c2 = j%n + 1;

            if (abs(r2-r1) + abs(c2-c1) <= 2) continue;

            for (int k=0; k<n*n; k++) {
                r3 = k/n + 1;
                c3 = k%n + 1;

                if (abs(r3-r2) + abs(c3-c2) <= 2 || abs(r3-r1) + abs(c3-c1) <= 2) continue;

                //여기까지 들어왔으면 최솟값 갱신해야 함
                int cost =
                    ground[r1][c1] + ground[r1][c1+1] + ground[r1][c1-1] + ground[r1-1][c1] + ground[r1+1][c1]
                + ground[r2][c2] + ground[r2][c2+1] + ground[r2][c2-1] + ground[r2-1][c2] + ground[r2+1][c2]
                + ground[r3][c3] + ground[r3][c3+1] + ground[r3][c3-1] + ground[r3-1][c3] + ground[r3+1][c3];

                answer = min(answer, cost);
            }
        }
    }
    cout << answer;
}