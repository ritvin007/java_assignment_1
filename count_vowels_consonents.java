import java.util.Scanner;

public class Countvowelsconsonants {
    public static void main(String[] args) {
        Scanner scanncer = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); 
        int vowelcount = 0;
        int consonantcount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelcount++;
                } 
                else {
                    consonantcount++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        scanner.close();
    }
}