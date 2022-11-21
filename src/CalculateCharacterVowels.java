import java.util.Scanner;

public class CalculateCharacterVowels {
    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println();
        char ch = in.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("enter the character "+ch+" is vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("enter the character"+ch+"is consonant");
        }
        else
            System.out.println("not an alphabet");
    }
}
