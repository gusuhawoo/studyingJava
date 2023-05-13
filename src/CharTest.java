public class CharTest {
  public static void main(String[] args) {
    char c='A';
    System.out.println("c = " + c); // c = A
    int a='A';
    System.out.println("a = " + a); // a = 65

    int b='가';
    System.out.println("b = " + b); // b = 44032
    char han='가';
    System.out.println("han = " + han); // han = 가
    int hanU='\uAC00';
    System.out.println("hanU = " + hanU); // hanU = 44032
    System.out.println("hanU = " + (char)hanU); // hanU = 가 → int형을 강제로 char로 casting(형변환)

    int d='あ';
    System.out.println("d = " + d); // d = 12354

    int e='E'+1;
    System.out.println("e = " + e); // e = 70
    System.out.println("e = " + (char)e); // e = F → int형을 강제로 char로 casting(형변환)

    char upper='A';
    char lower=(char)(upper+32);
    System.out.println("lower = " + lower); // lower = a

    char lower2='u';
    int upper2=lower2-32;
    System.out.println("upper2 = " + upper2); // upper2 = 85
    System.out.println("upper2 = " + (char)upper2); // upper2 = U

    // '0'=48
    char i='1'; // 49-48=1
    char j='2'; // 50-48=2
    int sum=i+j; // sum = 99
    System.out.println("sum = " + sum); // sum = 99
//    sum=(i-48)+(j-48);
//    System.out.println("sum = " + sum); // sum = 3
    sum=(i-'0')+(j-'0');
    System.out.println("sum = " + sum); // sum = 3

    // '1'+'2'+'3'+'4'+'5'=15
    int num=('1'-'0')+('2'-'0')+('3'-'0')+('4'-'0')+('5'-'0');
    System.out.println("num = " + num); // num = 15
  }
}
