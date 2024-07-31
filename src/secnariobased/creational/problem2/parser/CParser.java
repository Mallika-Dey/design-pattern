package secnariobased.creational.problem2.parser;

import secnariobased.creational.problem2.language.Language;

public class CParser implements Parser{
    public CParser() {
    }

    @Override
    public void parseLanguage(Language language) {
        System.out.println("c parser");
    }
}
