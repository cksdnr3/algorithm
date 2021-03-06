# Idea

## Sliding window

하나의 배열의 고정된 범위를 탐색해야 하는 경우 Sliding window 를 이용해 문제를 해결해 볼 것을 고려해보는 것이 좋다.  
이 문제의 경우 주어진 배열을 순회하며 고정된 k 범위를 탐색한다.  
크기가 k로 고정된 범위를 window 라 부른다. Sliding window의 핵심 개념은 윈도우들이 가지는 공통 요소를 다시 탐색하지 않는 것인데 윈도우를 순차적으로 탐색 시 두 윈도우의 차이점은 맨 앞요소와 맨 뒷요소가 다르다는 점을 이용해 윈도으를 갱신한다.

Sliding window 기법을 적용할 수 있는 조건

1. k가 고정 -> 윈도우 사이즈가 상수
2.모든 window를 순회할 필요가 있는 경우
3. 갱신 방법이 단순해야한다. -> 이 문제의 경우 윈도우의 합을 구하기 때문에 비교적 단순함.

# Practice

같은 반인 현무와 재윤이는 이번 주 청소 당번이다. 현무와 재윤이는 서로 내기를 하여 청소일을 한 명에게 몰아주기로 하였다. 간단한 게임을 통해 지는 사람이 두 명분의 청소를 하기로하고 재윤이는 아래와 같은 게임을 현무에게 제안하였다.

재윤이는 총 N개의 종이컵의 안 쪽에 임의의 자연수를 적어둔다.
모든 종이컵은 숫자가 보이지 않도록 뒤집은 채로 일렬로 나열한다.
종이컵의 위치는 게임 도중에 변경될 수 없다.
현무는 임의의 인접한 K개의 연속된 종이컵을 선택하여 숫자를 확인하고 그 숫자들의 합을 구한다.
해당 숫자들의 합이 짝수이면 재윤이가 청소를 하고, 홀수이면 현무가 청소를 한다.

게임을 시작하기 전 현무는 재윤이가 숫자들을 자신이 이길 수 밖에 없도록 조작한 것이 아닌지 의심을 하게되었다. 하지만 재윤이가 워낙에 많은 종이컵을 준비해두었기에 일일이 확인을 해보기는 힘들었다. 현무는 당신에게 재윤이가 적은 숫자들로 게임을 진행할 경우 자신이 이길 수 있는 경우가 존재하는지 확인해달라는 부탁을 하였다. 현무를 위해 프로그램을 만들어주자.

### **입력 형식**

첫 줄에는 종이컵의 수 **_N_**과 현무가 선택할 종이컵의 수 **_K_**가 공백으로 구분되어 주어진다. **_N_**과 **_K_**는 1이상 10만 이하의 자연수이다.

두 번째 줄에는 총 **_N_**개의 종이컵에 적힌 숫자들이 실제 놓여진 순서대로 주어진다. 종이컵에 적힌 숫자들은 모두 0이상 100만 이하의 정수이다.

### **출력 형식**

첫 줄에 현무가 이겨서 재윤이가 청소를 하게 될 수 있는 경우의 수가 존재한다면 `YES`를 출력하고, 그렇지 않다면 `NO`를 출력한다.
