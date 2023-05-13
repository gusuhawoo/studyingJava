public class BinaryTest {
  public static void main(String[] args) {
    int a=10;
    float f=35.6f;
    boolean b=false;
    char c='A';
    String d="APPLE";

    // 69를 10진수,2진수,8진수,16진수로 출력
    int decimal=69; // 10진수
    System.out.println("decimal = " + decimal); // decimal = 69
    int binary=0b01000101; // 2진수
    System.out.println("binary = " + binary); // binary = 69
    int octal=0105; // 8진수
    System.out.println("octal = " + octal); // octal = 69
    int hexa=0x45; // 16진수
    System.out.println("hexa = " + hexa); // hexa = 69
  }
}
