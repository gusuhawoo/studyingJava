public class CharExam {
  public static void main(String[] args) {
    // '1'+'2'+'3'+'4'+'5'=15 ← CharTest file
    int sum=0; // '0' → 48
    sum=sum+('1'-'0'); // '1' → 49
    sum=sum+('2'-'0');
    sum=sum+('3'-'0');
    sum=sum+('4'-'0');
    sum=sum+('5'-'0');
    System.out.println("sum = " + sum); // sum = 15

//    int(4byte) → char(2byte) = (char)65 → 'A'
//    char(2byte) → int(4byte) = (int)'A' → 65
//    float(4byte) → int(4byte) = (int)2.6f → 2(손실됨)
//    int(4byte) → float(4byte) = (float)10 → 10.0f
  }
}
