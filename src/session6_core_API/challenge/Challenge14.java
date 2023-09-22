package session6_core_API.challenge;

import java.util.Scanner;

//14. Remove Comments from Code
//Description: Create a Java program using StringBuilder that removes all single line (//) and multi-line (/* */) comments from a provided piece of code.

public class Challenge14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codeSample =
                "this is some code\n" +
                        "code1\n" +
                        "code2 // inline comment\n" +
                        "code3\n" +
                        "/* biggo comment\n" +
                        " * big giant comment\n" +
                        " * very big comment\n" +
                        " */\n" +
                        "//another inline comment";
        StringBuilder input = new StringBuilder(codeSample);
        System.out.println(input);
        System.out.println();
        System.out.println("after removing comments:");
        System.out.println();

        removeMultiLineComments(input);
        removeSingleLineComments(input);

        System.out.println(input);
        sc.close();
    }

    static void removeSingleLineComments(StringBuilder codeString) {
        int nextLineIndex = codeString.indexOf("//");
        while (nextLineIndex != -1) {
            int NewLineIndex = codeString.indexOf("\n", nextLineIndex);
            if (NewLineIndex == -1) {
                //eof
                NewLineIndex = codeString.length();
            }
            codeString.delete(nextLineIndex, NewLineIndex); // this should leave enter alone
            nextLineIndex = codeString.indexOf("//");
        }
    }

    static void removeMultiLineComments(StringBuilder codeString) {
        int openingIndex = codeString.indexOf("/*");
        while (openingIndex != -1) {
            int closingIndex = codeString.indexOf("*/");
            codeString.delete(openingIndex, closingIndex + 2);
            openingIndex = codeString.indexOf("/*");
        }
    }
}
