
//Hawzin Hassan mohammed
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Analysis {

    static String chiper = "";

    public static void frequency_letter(String str) {

        int[] freq = new int[str.length()];
        int i, j;


        char string[] = str.toCharArray();

        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;


                    string[j] = '0';
                }
            }
        }


        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.print(string[i] + "->" + freq[i] + ",");
            }
        }
    }

    public static void repalce_letter(String str) {
        str = str.toLowerCase();
        chiper = chiper.toLowerCase();
        String[] txt = str.split(",");

        for (int i = 0; i < txt.length; i++) {

            String[] txt_replace = txt[i].split(":");
            chiper = chiper.replace(txt_replace[0], txt_replace[1]);
        }

        System.out.println("\n\nPlain Text : \n\n" + chiper + "\n");

    }

    public static void main(String[] args) {

        try {

            System.out.println("\nChiper text :\n");
            if (!args[0].equals("")) {
                File myObj = new File(args[0]);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    chiper += data;
                    System.out.println(data);
                }
                myReader.close();

                System.out.println("\nAnalysis :\n");
                frequency_letter(chiper);
                System.out.println("");
                /////////////////////////////////////////
                Scanner inp = new Scanner(System.in);
                System.out.println("\nChoose Option :\n ");
                System.out.println("1) Take replace rule : ");
                System.out.println("2) Exit : \n");
                String option = inp.nextLine();

                switch (option) {
                    case "1":
                        System.out.println("\nEnter replacement rule->\n");
                        String rule = inp.nextLine();

                        repalce_letter(rule);

                        break;
                    case "2":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong option");
                        System.exit(0);
                        break;
                }

            } else {
                System.out.println("Please Enter the File Name");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
