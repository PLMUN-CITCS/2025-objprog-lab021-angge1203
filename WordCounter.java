import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = getSentenceInput(scanner);
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
        scanner.close();
    }

    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); 
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");  
        return words.length; 
    }
}
