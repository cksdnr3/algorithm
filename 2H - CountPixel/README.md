# Idea

1. 주어진 문제를 푸는데 감을 잡기 어렵다면 논리적으로 문제가 안되는 선에서 문제를 변형하여 푸는 것이 좋다.
   이번 문제의 경우 원의 중심을 (0, 0)으로 옮겨 푸는 것이 주어진 정보의 성질을 파악하기 용이하다.
2. 주어진 문제는 원에 포함되는 픽셀의 갯수를 세는 문제이다. 원은 사분면이 모두 대칭하고 픽셀의 갯수를 세는 문제이기 때문에 1 사분면 픽셀의 갯수를 세어 4를 곱할 수 있다.
   이때 1 사분면에는 양의 좌표만 존재하기 때문에 음의 좌표는 고려할 필요가 없어 문제를 풀기 더욱 용이하다.
3. 이 문제는 탐색할 데이터가 주어지지 않는 추상적 데이터에 대한 탐색이 필요하다. 이러한 문제는 조건을 판단할 기준을 잡고 기준에 대한 조건을 판단해 문제를 풀어가야 한다.
   이 문제의 경우 1픽셀에 해당하는 사각형을 구성하는 하나의 꼭지점을 기준으로 잡고 해당 점과 원의 중심의 거리와 반지름의 거리를 비교해 문제를 풀수 있다.

# Practice

컴퓨터는 이미지 정보를 2차원 배열 형태로 저장한다. 하지만 현실의 사물들의 모양을 그대로 저장하는 것은 불가능하다. 정밀한 이미지를 저장할수록 더 많은 공간과 연산량을 필요로 하기 때문이다. 영상을 구성하는 하나의 픽셀은 정사각형 형태로 존재하며 이 픽셀들이 모여 2차원 배열의 모양을 구성하게 된다.

반지름이 5픽셀인 원을 비트맵 형태로 저장하면 위와 같다. 그림에서 알 수 있는 것 처럼 실제로 원에 포함되는 픽셀들은 아래와 같은 특징을 가진다.

- 네 점이 모두 원 안에 존재하거나
- 원과 겹치는 영역이 존재하면서 두개 이상의 변이 원의 외곽선과 교차한다.

그렇다면 반지름이 임의의 **_R_**픽셀인 원이 포함하는 픽셀의 수를 계산하는 프로그램을 작성해보자.

### **입력 형식**

이 문제는 여러 개의 테스트케이스로 구성되어있다. 첫 줄에는 테스트케이스의 수를 나타내는 1이상 10이하의 자연수 **_T_**가 주어진다.

각 테스트 케이스는 한 줄로 구성되며 계산하고자 하는 원의 반지름의 픽셀 수 **_R_**이 주어진다. **_R_**은 1이상 10만 이하의 자연수이다.

### **출력 형식**

각 테스트케이스를 두 줄에 걸쳐서 출력한다.

- 테스트케이스의 첫 줄에는 테스트 케이스의 번호를 `#1, #2, #3, ...` 형태로 출력한다
- 테스트케이스의 두 번째 줄에는 반지름이 **_R_**픽셀인 원이 포함하는 픽셀의 수를 출력한다.

### **문제 출처**

- 中南大学第五届大学生程序设计竞赛
