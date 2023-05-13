public class BynaryExam {
  public static void main(String[] args) {
    int data=123;
    String binary=Integer.toBinaryString(data); // to → 바꾸겠다는 의미
    System.out.println("binary = " + binary); // binary = 1111011 → 0b1111011
    // Integer라는 class안의 toBinaryString(data)라는 메소드(동작)를 이용해서 binary(2진수)로 바꿔줌
    String octal=java.lang.Integer.toOctalString(data); // 8진수
    System.out.println("octal = " + octal); // octal = 173 → 0173
    String hexa=java.lang.Integer.toHexString(data); // 16진수
    System.out.println("hexa = " + hexa); // hexa = 7b → 0x7b

    int x=123;
    System.out.println("x = " + x); // x = 123
    int y=0b1111011;
    System.out.println("y = " + y); // y = 123
    int z=0173;
    System.out.println("z = " + z); // z = 123
    int u=0x7b;
    System.out.println("u = " + u); // u = 123
  }
}
