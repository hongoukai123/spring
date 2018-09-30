package com.kai.chap;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 如果将@Autowired注解放到setter上，会先执行该对象的构造方法，然后在执行所调用的spellCheck()方法
 * @author hok
 * @since 2018-9-29 17:10:11
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        System.out.println("这是spellCheck.");
    }
}
