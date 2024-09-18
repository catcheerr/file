import java.util.Scanner;
public class file1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt(); 
        String str = " ";
        int l = 0;
        int flag = 0;
        if (a < 0){
            a = -a; 
            flag = 1; 
        }
        while (a > 0){
            str += a % 2;
            a /= 2;
            l++;
        }
        int l2 = 7 - l; 

        while (l2 > 0){
            str += '0';
            l2--;
        }
        char[] str1 = str.toCharArray();
        String str2 = " ";
        if (flag == 0){
            str2 += '0';
        }
        else str2 += '1'; 
        l = 7;
        while (l!=0){
            if (flag == 1){
                if (str1[l] == '0')
                    str1[l] = '1';
                else str1[l] = '0';
            }
            str2 += str1[l];
            l--;
        }
        System.out.printf("Your number is in binary notation: %s \n", str2);
        //System.out.printf("%d", l);
    }
}
