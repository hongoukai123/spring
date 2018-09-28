package com.kai.chap;

/**
 * 为实现内部注入
 * @author hongok
 * @since 2018-9-28 16:15:44
 */
public class TextEditor2 {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
