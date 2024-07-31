package secnariobased.creational.problem2.clientpackage;

import secnariobased.creational.problem2.aesthetics.Aesthetics;
import secnariobased.creational.problem2.language.Language;
import secnariobased.creational.problem2.parser.Parser;

public abstract class Editor {
    private Language language;
    private Aesthetics aesthetics;
    private Parser parser;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
