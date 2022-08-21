import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 15;
        System.out.println(toString(random_password( length )));

    }

    // convert the char array into String
   public static String toString(char [] a){
        String string = new String(a);
        return string;
    }

    // generate random password
   public static char [] random_password(int len){
       // A strong password has Cap_chars, Lower_chars,
       // numeric value and symbols. So we are using all of
       // them to generate our password

        String cap_chars = "ASDFGHJKLMNBVCXZQWERTYUIOP";
        String small_chars = "zxcvbnmlkjhgfdsaqwertyuiop";
        String character = "\"`!@#$%^&*(){_+?><:':,=}\"";
        String numbers = "1234567890";

        String value = cap_chars + character + small_chars + numbers;

        Random random = new Random();
        char [] password = new char[len];
        for (int i=0; i< len; i++){
            password[i] = value.charAt( random.nextInt(value.length()));
        }
        return password;
    }
}