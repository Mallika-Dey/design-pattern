package secnariobased.creational.problem2.clientpackage;

import secnariobased.creational.problem2.editorpackage.Editor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cs = 0;

        while (++cs < 5) {
            String filename = scan.next();

            int index = filename.lastIndexOf(".");

            if (index == -1) {
                System.out.println("invalid file type");
                return;
            }
            String extension = filename.substring(index);
            Editor editor = Editor.getEditorInstance();
            editor.parseFile(extension);

            editor.getAesthetics().getColor().aestheticsType();
            editor.getAesthetics().getFont().fontType();
            editor.getAesthetics().getStyle().aestheticsType();

            editor.getParser().parseLanguage();
        }
    }
}
