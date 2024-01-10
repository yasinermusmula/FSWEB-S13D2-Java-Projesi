public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPolindrome(1001));
        System.out.println(isPerfectNumber(-28));
        System.out.println(numberToWords(425345));

    }

    public static boolean isPolindrome(int num) {
       String number = Integer.toString(num);

       for (int i = 0; i<number.length() / 2; i++){
           if (number.charAt(i) != number.charAt(number.length()-i-1)){
               return false;
           }
       }
       return true;
    }



    public static boolean isPerfectNumber(int num) {
        if (num<0){
            return false ;
        }
        int sum = 0;
        for (int i = 1; i< num /2; i++){
            if (num % i == 0){
                sum+=i;
            }
        }
        return sum == num;
    }


public static String numberToWords(int num) {
    if (num < 0) {
        return "Invalid Value";
    }
    char[] digits = String.valueOf(num).toCharArray();
    String numToText = "";
    for (char digit : digits) { // digits 1,1  digit = 1
        switch (digit) {
            case '0':
                numToText += "Zero ";
                break;
            case '1':
                numToText += "One ";
                break;
            case '2':
                numToText += "Two ";
                break;
            case '3':
                numToText += "Three ";
                break;
            case '4':
                numToText += "Four ";
                break;
            case '5':
                numToText += "Five ";
                break;
            case '6':
                numToText += "Six ";
                break;
            case '7':
                numToText += "Seven ";
                break;
            case '8':
                numToText += "Eight ";
                break;
            case '9':
                numToText += "Nine ";
                break;
        }
    }
    return numToText.trim();
   }
}