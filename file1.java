import java.util.Scanner;
public class file1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        String str = " ";
        int l = 0;
        while (a > 0){
            str += a % 2;
            a /= 2;
            l++;
        }
        char[] str1 = str.toCharArray();
        String str2 = " ";
        while (l!=0){
            str2 += str1[l];
            l--;
        }
        System.out.printf("Your number is in binary notation:: %s \n", str2);
        //System.out.printf("%d", l);
    }
}
