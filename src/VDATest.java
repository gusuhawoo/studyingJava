public class VDATest {
  public static void main(String[] args) {
    // 변수의 선언과 할당
    int a; // 변수 선언 → 기억공간
    a = 10; // 변수 할당
    System.out.println("a = " + a); // a = 10

    // 변수의 초기화
    int b = 10; // 변수초기화 : 변수 선언과 동시에 초기화를 함
    int c = b;
    int d = b * 10;
    System.out.println("d = " + d); // d = 100

    // 변수의 누적(accumulate)
    // 하드코딩
    int sum = 0;
    sum = sum + 1; // 0+1
    sum = sum + 2; // 1+2
    sum = sum + 3; // 3+3
    sum = sum + 4; // 6+4
    sum = sum + 5; // 10+5
    System.out.println("sum = " + sum); // sum = 15
    // 반복문 사용(for 또는 while)
    int num = 0;
    int i;
    for (i = 1; i < 6; i++) {
      num += i;
    }
    System.out.println("num = " + num); // num = 15

    // 변수의 교환(swap) → 임시공간(tmp)를 사용하여 서로 다른 변수의 값을 교환함
    // x = 10; y = 20;
    // tmp = y;
    // y = x;
    // x = tmp;
    // x = 20; y = 10;
    int x = 10;
    int y = 20;
    System.out.println("x = " + x + ":" + "y = " + y); // x = 10:y = 20
    int tmp;
    tmp = y;
    y = x;
    x = tmp;
    System.out.println("x = " + x + ":" + "y = " + y); // x = 20:y = 10
  }
}
