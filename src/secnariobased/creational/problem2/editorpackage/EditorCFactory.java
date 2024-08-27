package secnariobased.creational.problem2.editorpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.aesthetics.CAesthetics;
import secnariobased.creational.problem2.parser.CParser;
import secnariobased.creational.problem2.parser.Parser;

public class EditorCFactory implements AbstractEditorFactory{
    @Override
    public Aesthetics getAesthetics() {
        return new CAesthetics();
    }

    @Override
    public Parser getParser() {
        return new CParser();
    }
}
