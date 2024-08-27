package secnariobased.creational.problem2.editorpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.aesthetics.CppAesthetics;
import secnariobased.creational.problem2.parser.CppParser;
import secnariobased.creational.problem2.parser.Parser;

public class EditorCppFactory implements AbstractEditorFactory{

    @Override
    public Aesthetics getAesthetics() {
        return new CppAesthetics();
    }

    @Override
    public Parser getParser() {
        return new CppParser();
    }
}
