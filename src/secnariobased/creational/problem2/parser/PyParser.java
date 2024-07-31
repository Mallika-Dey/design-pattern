package secnariobased.creational.problem2.parser;

import secnariobased.creational.problem2.language.Language;

public class PyParser implements Parser {
    public PyParser() {
    }

    @Override
    public void parseLanguage(Language language) {
        System.out.println("py parser");
    }
}
