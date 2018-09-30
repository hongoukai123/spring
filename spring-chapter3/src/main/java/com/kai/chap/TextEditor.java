package com.kai.chap;

/**
 * SpringBeans自动装配所需示例类
 * @author hongok
 * @since 2018-9-28 17:50:49
 */
public class TextEditor {

    private SpellChecker spellChecker;

    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
