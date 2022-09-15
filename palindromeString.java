
import java.util.Scanner;
class palindromeString {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 String str = in.nextLine(), reverseStr = "";
 int strLength = str.length();
 for (int i = (strLength - 1); i >=0; --i) {
 reverseStr = reverseStr + str.charAt(i);}
 if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
 System.out.println(str + " is a Palindrome String.");}
 else {
 System.out.println(str + " is not a Palindrome String.");}
 }
}
import java.util.Scanner
public class palindrome {
 public static void main(String args[]) {
 Scanner in = new Scanner(System.in);
int r, sum = 0, temp;
 int n = in.nextInt();
temp = n;
 while (n > 0) {
 r = n % 10;
 n = n / 10;
sum = (sum * 10)+r;
 }
 if(temp==sum)
 System.out.println(sum+" is palindrome number");
 else
 System.out.println(sum+" is not palindrome number");
 }
}
