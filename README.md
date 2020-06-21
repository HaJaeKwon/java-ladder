# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

# 과제 진행 - 사다리타기
> https://edu.nextstep.camp/s/KDgLkV1d/lt/AiVYd4Ly

## 사다리타기란?
* 사다리란 2차원 상에서 점들끼리 상하좌우로 연결된 형태
  * 표현할때 좌우길이가 상대적으로 길고, 우승자를 정할때 아래에서 위로, 위에서 아래로 이동하는 방식 때문에 사다리타기라고 부르는 듯 하다
* 위에서 아래로 이동시에 좌,우로 연결된 지점에 도착할 수 있는데, 연결된 지점을 만난다면 반드시 이동해야 한다
* 연결된 지점이 없다면 다시 아래로 내려간다
* 가장 아래에 도착했을때 위치에 따른 보상이 주어진다

## 프로그래밍 요구사항
* 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다.
* indent depth는 2를 넘지 않는다.
* method 길이는 15라인을 넘지 않는다.
* 자바 코드 컨벤션을 지킨다.
* else 예약어를 쓰지 않는다.
* 자바 8의 스트림과 람다를 적용해 프로그래밍한다.
* 규칙 6: 모든 엔티티를 작게 유지한다.
* 각 객체가 2개 이하의 인스턴스 변수만을 가지도록 구현해본다.

## 요구사항
* 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
  * 사다리 X좌표마다 "이름"을 부여할 수 있다.
  * 이름은 최대 5자
  * 사다리 출력시 이름을 같이 출력
* 사람 이름은 쉼표(,)를 기준으로 구분한다.
  * InputView에서 ","를 기준으로 이름들을 입력받는다.
* 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
  * Y좌표마다 이동할 수 있는 범위는 좌,우 중 1개 경로만 가능하다
* 사다리 실행 결과를 출력할 수 있다
  * 이름을 입력 받으면 개인별 결과를 출력한다.
  * all을 입력하면 전체 참여자의 실행 결과를 출력한다.
  
* 책임주도설계
  * 책임: 사다리게임을 해라
    * LadderGame
    * 이름을 입력 받아라
      * InputView
    * USER를 만들어라
      * User
    * 사다리를 만들어라
      * LadderGenerator
        * RandomLadderGenerator
      * Ladder
        * List<Line> lineList
      * Line
        * List<Boolean> points
    * 사다리타기를 진행해라
      * Ladder
        * int getGameResult(int x)
      * Price
        * int getPrice(int x)
    * 사다리를 출력하라
      * OutputView
      
* TDD
  * User
    * 이름은 5자 이하여야 한다
    * 이름은 5자 보다 크면 예외 발생
  * Ladder
    * 각 x좌표에 대해서 올바른 결과 x좌료를 반환해야 한다
  * Line
    * 사다리가 연속으로 연결될 수 없다.
    * 0번 위치에 사다리가 연결될 수 없다
