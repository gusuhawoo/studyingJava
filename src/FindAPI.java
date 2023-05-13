public class FindAPI {
  public static void main(String[] args) {
    // 기본 자료 (PDT)
    int a; // 변수 선언

    // 사용자 정의 자료형(UDDT)
    String s; // 문자열 저장
    //java.lang.String의 java.lang.이 생략되어있음(여기서 java와 lang은 패키지(=폴더)를 가리킴)
    s="APPLE";
    System.out.println("s = " + s); // s = APPLE
    System.out.println(s.length()); // 5 String 클래스 안의 length등의 기능을 사용할 수 있음
    // 객체지향 : 필요한 API를 언제든지 가져와서 원하는 것들을 만들 수 있음
  }
}
