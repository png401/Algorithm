#include <iostream>
#include <vector>
#include <queue>

using namespace std;

//info 구조체. 사람 정보 담을 것. 개인 인덱스, 줄 번호, 급한 정도, 근무일수
struct info {
    int index;
    int line_num;
    int urgency;
    int work_days;
};

//비교할 구조체 함수
//cmp (a, b) -> a<b이면 true : 뒷인자 우선순위가 더 크다. 맥스힙임.
struct compare {
    //멤버 함수. 함수처럼 보이는 객체
    bool operator()(info &a, info &b){
        //근무일수 더 많은 사람
        //근무일수 같으면 급한정도 더 큰 사람
        //다 같으면 줄번호 앞인 사람
        if (a.work_days != b.work_days) return a.work_days < b.work_days;
        if (a.urgency != b.urgency) return a.urgency < b.urgency;
        return a.line_num > b.line_num; //뒷인자 작을 때 true : 뒷인자 우선순위 작으면 커진다.
    }
};

//시뮬레이션 함수
int simulation(int m, int k, vector<queue<info>> &lines){
    //일단 먼저 우선순위 큐에 각 선두들만 집어넣어서 초기화
    priority_queue<info, vector<info>, compare> pq;
    //info 타입 저장, vector기반, compare 기준으로 정렬한다.

    //아 초기화
    for (int i=0; i<m; i++) {
        if (!lines[i].empty()) {
            pq.push(lines[i].front());
            lines[i].pop();
        }
    }

    int count =0;
    //k랑 비교하면서
    //k가 아닌 이상 계속 반복 뭐를?
    while (!pq.empty() && k!=pq.top().index) {
        //우선순위 큐에서 뽑아내고, 뽑아낸 선두에서 다시 우선순위 큐로 채워넣고.
        int the_line = pq.top().line_num;
        pq.pop();

        //front() 이거 쓰려면 항상 .empty()조건 확인하기!!!
        if (!lines[the_line].empty()) {
            pq.push(lines[the_line].front());
            lines[the_line].pop();
        }

        count++;
    }

    return count;
}

int main() {
    //입력받기
    //사람 수 n, 줄 수 m, 데카 위치 k
    int n, m, k;
    cin >> n >> m >> k;

    //줄 큐들을 담을 벡터 만들기 m개, queue<info>() 형식
    vector<queue<info>> lines (m, queue<info>());

    //각 사람들의 work_days, urgency 입력받기
    int d, h;

    for (int i=0; i<n; i++) {
        //각 사람들의 work_days, urgency 입력받기
        cin >> d >> h;
        lines[i%m].push({i, i%m, h, d});
    }

    cout << simulation(m, k, lines);

}

