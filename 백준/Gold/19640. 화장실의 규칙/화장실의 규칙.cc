#include <iostream>
#include <queue>
#include <vector>

using namespace std;

/*
 * info 구조체:
 * 한 사람의 정보 저장
 * - idx: 사람 번호 (데카인지 확인용)
 * - line_num: 몇 번째 줄인지
 * - work_days: 근무 일수 (우선순위 1)
 * - urgency: 급한 정도 (우선순위 2)
 */
struct info {
    int idx; //사람 인덱스
    int line_num; //줄 번호
    int work_days;//근무일수
    int urgency;//급한 정도
};

/*
 * cmp 구조체:
 * priority_queue에서 사용할 비교 기준
 *
 * 우선순위:
 * 1. work_days 큰 사람
 * 2. urgency 큰 사람
 * 3. line_num 작은 사람
 *
 * 반환값:
 * true → child가 뒤로 감
 * false → child가 앞으로 감 (우선순위 높음)
 */

//우선순위 큐에선 true : 첫번째 인자 값을 뒤로 보낸다. 왜? 첫번째 인자가 더 작다.
//아하 cmp(a, b) : a < b로 읽기 : 맥스힙이므로 true면 b가 먼저, a가 나중이다.
struct cmp {
    bool operator()(info &a, info &b) {
        //if (a.work_days < b.work_days) return true;
        //if (a.urgency < b.urgency) return true;
        //if (a.line_num < b.line_num) return false;

        if (a.work_days != b.work_days) return a.work_days < b.work_days;
        //work_days가 다르면 : return 하고 끝
        //work_days가 같으면 : return 안하고 다음 줄로

        if (a.urgency != b.urgency) return a.urgency < b.urgency;
        //urgency가 다르면 : return 하고 끝
        //urgency가 같으면 : return 안하고 다음 줄로

        return a.line_num > b.line_num;
        //work_days도 같고, urgency도 같을 때 최종 판단
        //여기서는 true가 나오면 안되고, false 가 나와야 함. 왜냐면 그래야
        //true : 무조건 앞인자를 뒤로 보냄.
        //a가 클 때를 true로 놓으면 -> 앞인자인 a를 뒤로 보내게 된다.
        //결과 : 줄번호 작은 게 앞으로 오게 된다.
    }
};

/*
 * simulation 함수:
 * - 각 줄(queue)의 상태를 받아서
 * - 데카(k)가 화장실에 들어가기 전까지
 *   몇 명이 먼저 들어갔는지 계산
 */
int simulation(int m, int k, vector<queue<info>> &lines) {
    //m: 줄 개수, k:
    // 각 줄의 "맨 앞 사람들"만 모아서 관리하는 우선순위 큐
    priority_queue<info, vector<info>, cmp> pq;
    /*
     * 초기 세팅:
     * 각 줄의 맨 앞 사람을 pq에 넣기(넣기 전엔 비었나 체크!), 줄에서 pq 넣었으면 빼야 한다.
     * (넣은 후 해당 줄에서는 제거)
     */
    for (int i=0; i<m; i++) {
        if (!lines[i].empty()) {
            pq.push(lines[i].front());//lines는 사람들 넣어놓은 큐
            lines[i].pop();
        }
    }

    // 데카보다 먼저 화장실 사용한 사람 수
    int count = 0;

    /*
     * 시뮬레이션:
     * - pq에서 가장 우선순위 높은 사람을 꺼냄
     * - 그 사람이 데카면 종료
     * - 아니면 count 증가
     * - 해당 줄에서 다음 사람을 pq에 추가
     * - 왜 해당 줄인고 하니... "선두"만 우선순위 큐에 넣는거니까 한 줄의 선두 빠졌으면 다음 선두를 집어넣어야 하는 것.
     */
    while (!pq.empty() && pq.top().idx != k) {
        count++;
        int the_num = pq.top().line_num;
        pq.pop();
        //이렇게 .front()하기 전에 비었나 체크해야 함. empty()체크
        if (!lines[the_num].empty()) {
            pq.push(lines[the_num].front());
            lines[the_num].pop();
        }
    }
    // 결과 반환
    return count;
}

int main() {

    // 입출력 속도 향상

    int n, m, k, d, h;
    cin >> n >> m >> k;
    // n: 사람 수, m: 줄 수, k: 데카 번호

    /*
     * lines:
     * m개의 줄(queue) 생성
     */
    vector<queue<info>> lines (m, queue<info>());


    /*
     * 입력:
     * i번째 사람 → i % m 줄에 배치
     */
    for (int i=0; i<n; i++) {
        cin >> d >> h;
        lines[i%m].push({i, i%m, d, h});
    }

    // 시뮬레이션 실행 후 결과 출력
    cout << simulation(m, k, lines);

    return 0;
}