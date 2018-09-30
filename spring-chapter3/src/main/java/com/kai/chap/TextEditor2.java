package com.kai.chap;

/**
 * 用于SpringBeans的构造函数自动装配
 * @author hongok
 * @since 2018-9-28 18:12:44
 */
public class TextEditor2 {

    private SpellChecker spellChecker;

    private String name;

    public TextEditor2(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
