package secnariobased.creational.problem2.editorpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.parser.Parser;

public interface AbstractEditorFactory {
    Aesthetics getAesthetics();
    Parser getParser();
}
