import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        Ededlerin inputdan daxil edilmesi
        Scanner scanner = new Scanner(System.in);
        int deyer1 = scanner.nextInt();
        int deyer2 = scanner.nextInt();
        int arr[] = new int[16];
        int secArr[] = new int[16];


//         Verilen ededlerin 2 lik say sistemine kecirilmesi ve array'e daxil edilmesi

        // birinci ededin 2 lik say sistemine kecirilir
        for (int i = 0; i < 15; i++) {
            if (deyer1 % 2 == 1 || deyer1 == 1) {
                arr[i] = 1;
            } else if (deyer1 % 2 == 0 || deyer1 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 0;
            }
            deyer1 = deyer1 / 2;
        }
        // ikinci ededin 2 lik say sistemine kecirilir
        for (int i = 0; i < 15; i++) {
            if (deyer2 % 2 == 1 || deyer2 == 1) {
                secArr[i] = 1;
            } else if (deyer2 % 2 == 0 || deyer2 == 0) {
                secArr[i] = 0;
            } else {
                secArr[i] = 0;
            }
            deyer2 = deyer2 / 2;
        }
//        arraylarin and operatoru tipli muqayisesi ve esas arraye daxil edilmesi
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(secArr));
        int mainArray[] = new int[16];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && secArr[i] == 1) {
                mainArray[i] = 1;
            } else {
                mainArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mainArray));
//        ikilik say sisteminde olan neticenin 10 luq say sistemine cevrilmesi
        int result = 0;
        int min = 2;
        for (int i = 0; i < mainArray.length; i++) {
            result += (int) (Math.pow(min, i) * mainArray[i]);
        }
        System.out.println(result);
    }



}

