#include <iostream>
#include <string>

using namespace std;

int main() {
    //기본 세팅
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //N, king, stone 명령 입력받기
    int N;
    string king, stone;
    cin >> king >> stone >> N;

    //문자열 좌표를 숫자로 변환
    int kx = king[0] - 'A';
    int ky = king[1] - '1';
    int sx = stone[0] - 'A';
    int sy = stone[1] - '1';


    //명령들 N번 처리
    for (int i=0; i<N; i++) {
        //매번 선언해서 초기화시키기
        int dx = 0;
        int dy = 0;

        string cmd;
        cin >> cmd;

        if (cmd == "R") dx =1, dy = 0;
        else if (cmd == "L") dx = -1, dy=0;
        else if (cmd == "B") dx = 0, dy = -1;
        else if (cmd == "T") dx = 0, dy = 1;
        else if (cmd == "RT") dx = 1, dy = 1;
        else if (cmd == "LT") dx = -1, dy = 1;
        else if (cmd == "RB") dx = 1, dy = -1;
        else if (cmd == "LB") dx = -1, dy = -1;

        //킹 마지막 위치 + 명령 계산
        int next_kx = kx + dx;
        int next_ky = ky + dy;
        
        //킹 이동했는데 체스판 바깥이면 continue 이번 명령 무시
        if (next_kx < 0 || next_kx >= 8 || next_ky < 0 || next_ky >= 8) continue;
        
        //킹 이동했는데 돌이랑 겹치면
        if (next_kx == sx && next_ky == sy) {
            //돌 킹 움직인 방향(dx, dy)만큼 이동했는데 
            int next_sx = sx + dx;
            int next_sy = sy + dy;
            
            //돌이 체스판 바깥이면 그것도 이번 명령 무시 continue
            if (next_sx < 0 || next_sx >= 8 || next_sy < 0 || next_sy >= 8) continue;
            
            //위 경우들이 아니면
            sx = next_sx;
            sy = next_sy;
        }
        
        //정상적으로 King 움직임
        kx = next_kx;
        ky = next_ky;
    }
    
    //다시 숫자들 문자열로 변환해서 출력하기
    cout << char(kx+'A') << char(ky + '1') << '\n';
    cout << char(sx+'A') << char(sy + '1') << '\n';
        //매번 선언해서 초기화시키기


        //킹 마지막 위치 + 명령 계산


        //저 위의 값 토대로 체스판 나가는지 확인해서 이동시킴.
        //킹 이동했는데 체스판 바깥이면 이번 명령 무시


        //킹 이동했는데 돌 위치랑 똑같으면

            //킹 움직인 거랑 같은방향으로(dx, dy 반영) 돌도 움직임


            //돌 이동시켰는데 체스판 바깥으로 나가면 이번 명령 무시

            //다 아닌경우 돌 이동

        //다 아닌경우 king 이동


    //다시 숫자를 문자열로 변환해서 출력


    
}