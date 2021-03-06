# Idea

## 정수 - 몫과 나머지에 대한 성질

보통 행과 열이 있는 자료구조를 순회하는 경우 두 개의 반복문을 통해서 순회한다. 두 개의 반복문을 통해서 순회를 할 때 그 인덱스를 살펴보면 일정한 규칙이 생기는데,

- 행 번호는 규칙적인 일정한 마디가 생기고 (몫과 관련)
- 열 번호는 순환하는 일정한 주기가 생긴다. (나머지와 관련)

## 배열의 인덱스와 나머지

어떤 숫자를 N 이라는 숫자로 나눌 때 이 나머지의 범위는 0 ~ (N - 1) 로 표현된다. 따라서 0 베이스의 배열을 순회하는 경우 생각해볼 만한 아이디어이다.

이 문제의 경우
행(i) = i / 9;
열(j) = i mod 9;

## 그룹 번호 계산하기

그룹 번호와 같이 행과 열의 모두 영향을 받아 규칙을 발견하기 쉽지 않은 경우 행과 열을 따로 구분하면 규칙이 쉽게 보이는 경우가 있다.

# Preactice

스도쿠란 아래의 그림 처럼 9행 9열의 보드에 1~9사이의 숫자들을 규칙에 맞게 채워넣는 게임을 말한다. 9행 9열의 보드에는 총 81개의 칸이 있는데 지수는 보통 각 칸을 1~81로 번호를 붙여서 구별한다. 가장 왼쪽 위의 (1행 1열의)칸이 1번 칸이 되고 그 이후 오른쪽으로 가면서 번호를 하나 증가시킨다. 그리고 해당 행이 다 차면 다음줄로 넘어가 이를 반복한다.

스도쿠는 게임의 특징상 각 행과 각 열 그리고 3x3모양의 9칸으로 구성된 그룹에 1~9의 숫자가 하나씩만 들어가야 한다는 규칙이 있다. 그래서 각 칸에 숫자를 배치할 때 그 칸이 속한 그룹을 파악하고 규칙에 맞는지 확인하는 작업이 필요하다. 하지만 지수와 같이 스도쿠 게임을 하고 있는 예인이는 지수가 말하는 칸의 번호로 그 칸이 몇행 몇열에 위치한 칸이고 또 몇 번 그룹에 속한 칸인지 매번 계산하기가 힘이 들었다. 하지만 소심한 예인이는 자신보다 언니인 지수에게 이를 말하지 못하고 당신에게 도움을 요청했다. 지수가 말한 칸의 번호가 주어질 때, 그 칸이 속한 행, 열, 그룹의 번호를 계산해주는 프로그램을 작성해보자.

### **입력 형식**

이 문제는 여러개의 테스트케이스로 구성되어 있다.

첫 줄에는 테스트케이스의 수 **_T_**가 주어진다. **_T_**는 1이상 100이하의 자연수 중 하나이다.

각 테스트케이스에는 지수가 말한 칸의 번호가 1부터 81까지의 자연수로 공백없이 한 줄에 주어진다.

### **출력 형식**

모든 테스트케이스 별로 각 테스트케이스를 두 줄로 출력한다.

- 테스트케이스의 첫 줄에는 `Case #%d:` 형식으로 테스트케이스의 번호를 출력한다. 대소문자와 공백에 주의한다.
- 테스트케이스의 두 번째 줄에는 지수가 말한 칸의 행, 열, 그룹 번호를 공백으로 구분된 세 개의 자연수로 출력한다. `r c g`
