package secnariobased.creational.problem2.editorpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.aesthetics.PyAesthetics;
import secnariobased.creational.problem2.parser.Parser;
import secnariobased.creational.problem2.parser.PyParser;

public class EditorPyFactory implements AbstractEditorFactory{
    @Override
    public Aesthetics getAesthetics() {
        return new PyAesthetics();
    }

    @Override
    public Parser getParser() {
        return new PyParser();
    }
}
