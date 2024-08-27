package secnariobased.creational.problem2.editorpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.parser.Parser;

public class Editor {
    private static Editor editorInstance = null;
    private Aesthetics aesthetics;
    private Parser parser;

    private Editor() {
    }

    public static Editor getEditorInstance() {
        if (editorInstance == null) {
            editorInstance = new Editor();
        }
        return editorInstance;
    }

    public void parseFile(String fileExtension) {
        AbstractEditorFactory abstractEditorFactory = getEditorFactory(fileExtension);

        editorInstance.setAesthetics(abstractEditorFactory.getAesthetics());
        editorInstance.setParser(abstractEditorFactory.getParser());
    }

    private AbstractEditorFactory getEditorFactory(String fileExtension) {
        if (fileExtension.equals(".c")) {
            return new EditorCFactory();
        } else if (fileExtension.equals(".cpp")) {
            return new EditorCppFactory();
        } else if (fileExtension.equals(".py")) {
            return new EditorPyFactory();
        }
        throw new RuntimeException("invalid file type");
    }

    public Aesthetics getAesthetics() {
        return aesthetics;
    }

    public void setAesthetics(Aesthetics aesthetics) {
        this.aesthetics = aesthetics;
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
}
