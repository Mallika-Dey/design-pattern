package secnariobased.creational.problem2.parser;

import secnariobased.creational.problem2.language.Language;

public class CppParser implements Parser{
    public CppParser() {
    }

    @Override
    public void parseLanguage(Language language) {
        System.out.println("cpp parser");
    }
}
