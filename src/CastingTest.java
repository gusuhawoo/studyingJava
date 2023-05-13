public class CastingTest {
  public static void main(String[] args) {
    float f1=.10f; // 0.10
    System.out.println("f1 = " + f1); // f1 = 0.1
    float f2=15f; // 15.0
    System.out.println("f2 = " + f2); // f2 = 15.0
    float f3=3.14f; // 3.14
    System.out.println("f3 = " + f3); // f3 = 3.14
    double d1=123.4567;
    System.out.println("d1 = " + d1); // d1 = 123.4567

    float x=15.6f; // x = 15.6
    // int y=x; error
    int y=(int)x; // 실수를 날려버리고 정수로 변환(강제형변환으로 데이터 손실이 생김)
    System.out.println("y = " + y); // y = 15

    char c='A';
    int cc=c; // 자동형변환(작은타입(char) → 큰타입(int))

    int dd=5;
    double ddd=dd; // 자동형변환
    System.out.println("ddd = " + ddd); // 5.0

    double dx=14.67;
//    int dy=dx; // error
    int dy=(int)dx;
    System.out.println("dy = " + dy); // dy = 14
  }
}
