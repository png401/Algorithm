//n번째 어찌됐든 "큰" 수를 찾는거니까 숫자가 n개 초과하면 그 중 젤 작은 수를 뺀다.
//n=5, 1 2 3 4 5 6 입력되는 순간 젤 작은 수인 1인 5번째 큰 수일 가능성은 아예 사라진다.

//기본 셋팅
#include <iostream>;
#include <queue>;
#include <vector>;//우선순위 큐 내부 컨테이너로 vector 사용

using namespace std;

int main() {
    //기본 셋팅
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //입력받기
    int n;
    cin >> n;

    //최소 힙 선언
    priority_queue<int, vector<int>, greater<int>> pq;
    int x;
    for (int i=0; i<n*n; i++) {
        cin >> x;
        //힙에 집어넣고
        pq.push(x);
        //힙 사이즈가 n을 초과하면
        if (pq.size() > n) {
            //민힙이니 젤 작은 걸 팝한다.
            pq.pop();
        }
    }
    
    //반복 다 돌고 나서 젤 작은 값=n번째 큰 값 출력
    //예) 최종민힙 : 3 5 8 9 10, 5번째 큰 값 : 3
    cout << pq.top();

    //최소 힙 선언 최소 힙 만들기 왜? 젤 작은 수를 없앨거니까

    //n*n개 입력받을 것
    //현재 숫자 힙에 넣고
    //힙 크기가 n개 초과 시 가장 작은 값 제거해서 큰 수 n개만 남도록 유지

    //반복 끝나면 그 중 가장 작은 첫 번째 수 cout
}