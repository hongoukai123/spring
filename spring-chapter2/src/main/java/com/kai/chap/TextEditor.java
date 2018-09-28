package com.kai.chap;

/**
 * 以构造函数的方式注入
 * @author hongok
 * @since 2018-9-28 16:15:00
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
