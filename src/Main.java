

public class Main {
    public static void main(String[] args) {
        for(int i = 0;;i++) {
            System.out.print(fun(i));

        }
    }

    private static String fun(int i) {
        int steps = 0;
        int copy = i;
            for(;;steps++){
                if(String.valueOf(i).length() < 2||String.valueOf(i).contains("0")) break;
                else i = multiplyDigits(i);
            }
        return steps>=9? copy + " " + steps+"\n" : "";
    }

    private static int multiplyDigits(int i) {
        int result = 1;
        do{
            result *= i%10;
            i/=10;
        }while(i>0);
        return result;
    }

}
