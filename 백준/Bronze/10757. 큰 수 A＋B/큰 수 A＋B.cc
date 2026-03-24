//백준 10757 큰 수 a+b
//문자열로 받기
//1234 를 받고, 끝부터.. 더하니까 스택?? 쓰나??
//스택 2개 만들고, carry 0 초기화.

#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main() {
    stack <int> s1;
    stack <int> s2;
    stack <int> result;
    int carry = 0;
    int sum =0;
    //숫자 입력받는데 이걸 문자열로 받기
    string a;
    cin>>a;
    string b;
    cin>>b;

    //스택에 일단 집어넣어야 한다. 근데 집어넣을 때 숫자로 집어넣어야 함. 그래야 나중에 계산이 되니까...
    for (int i=0; i<a.size(); i++) {
        s1.push(a[i]-'0');
    }

    for (int i=0; i<b.size(); i++) {
        s2.push(b[i]-'0');
    }

    /*
    //각자 스택에 남아있는 게 모두 없을 때까지 반복..
    while (true) {
        if (s1.empty() && s2.empty()) break;
        sum = s1.top() + s2.top() + carry;
        carry = sum/10;
        result.push(sum%10);
        s1.pop();
        s2.pop();
        //sum을 10으로 나눈 나머지가 우리가 저장해야할 값. 결과 스택에 넣어야 할 값
        //
    }*/

    //반복을 s1.empty() 가 아니거나 s2.empty()가 아닌 한 반복
    while (!s1.empty() || !s2.empty()) {
        int x=0;
        int y=0;

        if (!s1.empty()) {
            x=s1.top();
            s1.pop();
        }
        if (!s2.empty()) {
            y=s2.top();
            s2.pop();
        }
        sum = x+ y + carry;
        carry = sum/10;// sum이 12 일케 나왔음 나머지2 : result 스택에 들어가야하고, 몫1 : 캐리에 들어가야함
        result.push(sum%10);
    }

    //while 반복문 끝났는데 캐리에 남아있다.  인 경우
    if (carry >0) result.push(carry);


    //결과 출력
    while (!result.empty()) {
        cout << result.top();
        result.pop();
    }

}