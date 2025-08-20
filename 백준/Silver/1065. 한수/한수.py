n = int(input())
count = 0

for i in range(1, n + 1):
    if i < 100:                 # 1~99는 모두 한수
        count += 1
    elif i < 1000:              # 100~999: 등차 확인
        a = i // 100            # 백
        b = (i // 10) % 10      # 십
        c = i % 10              # 일
        if (a - b) == (b - c):
            count += 1
    # 1000은 한수 아님

print(count)