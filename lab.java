import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] inputs = input.split(" ");
        String wordToSearchFor = inputs[1];
        String filename = inputs[2];

        try {
            Scanner scan = new Scanner(new File(filename)).useDelimiter("\\. ");
            while(scan.hasNext()){
                String currentSentence = scan.next();
                if(currentSentence.contains(wordToSearchFor)){
                    System.out.println(currentSentence+".");
                };

            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



     }
}
