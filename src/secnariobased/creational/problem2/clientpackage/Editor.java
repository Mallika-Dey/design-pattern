package secnariobased.creational.problem2.clientpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.parser.Parser;

public abstract class Editor {
    private Aesthetics aesthetics;
    private Parser parser;

    public Editor(Aesthetics aesthetics, Parser parser) {
        this.aesthetics = aesthetics;
        this.parser = parser;
    }
}
