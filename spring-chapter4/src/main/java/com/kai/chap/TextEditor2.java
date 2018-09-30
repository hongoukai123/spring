package com.kai.chap;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hok on 2018/9/29.
 */
public class TextEditor2 {

    @Autowired
    private SpellChecker spellChecker;

    public void checkSpell(){
        System.out.println("这里是checkSpell.");
        spellChecker.checkSpelling();
    }

}
