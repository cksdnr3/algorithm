# Idea

## 정보량과 비용

단순한 데이터는 계산이 용이해지지만, 그 만큼 손실되는 정보도 많다.  
복잡한 데이터는 계산이 복잡해지지만, 그 만큼 강한 정보가 된다.  
언제나 모든 정보에 대해서 계산을 하는 것이 항상 좋을 해결책은 아니다. 불필요한 정보에 대해서 계산하지 않고 필요한 데이터에 대해서만 단순화 해 계산을 용이하게 하는 편이 좋은 해결책이 될 수도 있다.
따라서 복잡한 데이터에 계산이 복잡해진다면 문제에서 요구하는 데이터를 정확히 파악하고 데이터를 단순화 해 조금 더 단순한 계산식을 세우는 것을 생각해보아야 한다.

# Practice

인기 아이돌 그룹 코들리즈(Codelyz)의 매니저인 당신은 우여곡절끝에 팬 사인회를 성공적으로 성공시켰다. 팬 카페에서도 이번 팬 사인회 선발 기준에 대한 긍정적인 반응들이 많았고, 회사에서도 당신의 문제해결능력을 칭찬하였다. 하지만 능력있는 사람은 항상 바쁜 법, 후배 매니저가 기획한 팬 사인회 내부 이벤트에 해결해야 할 문제가 있어 이를 도와주어야 한다. 후배 매니저가 기획한 이벤트는 아래와 같다.

- 팬 사인회에서 기본적으로 모든 팬들은 정해진 좌석에 앉아서 대기한다.
- 모든 좌석은 1부터 **_N_**번 사이의 자연수로 번호가 매겨져 있으며, 팬들은 좌석을 옮길 수 없다.
- 당신은 이 중 연속한 좌석 **_K_**개를 선택해 해당 좌석에 앉은 팬들을 대상으로 이벤트를 진행해야 한다.
- 이 이벤트는 생년월일 6자리를 사용한 추첨을 진행할 것이기 때문에, 이 **_K_**명끼리 서로 모두 주민등록번호 앞자리가 달라야만 한다.

각 팬들의 주민등록번호 앞자리가 숫자로 주어질 때, 당신은 이 이벤트를 진행할 수 있도록 연속한 **_K_**명을 선발할 수 있는 방법이 몇 가지인지 확인하고자 한다.

예를 들어 **_N=5, K=2_**일 때 아래와 같이 팬들의 생년월일이 있다면, 총 3가지 경우의 수가 존재한다.

---

**930503**
**930503**
**890412**
**670610**
**680525**

---

### **입력 형식**

첫 줄에는 팬의 수 **_N_**과 선발해야 할 사람의 수 **_K_**가 1이상 20만 이하의 자연수로 주어진다.

두 번째 줄에는 공백으로 구분 된 생년월일 6자리가 공백으로 구분되어 주어진다. 생년월일은 6자리 숫자로만 주어진다.

### **출력 형식**

생년월일이 서로 다른 연속된 **_K_**명을 선발할 수 있는 경우의 수를 한 줄에 공백없이 출력한다.
