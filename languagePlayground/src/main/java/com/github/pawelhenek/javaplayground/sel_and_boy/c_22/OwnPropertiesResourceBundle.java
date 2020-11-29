package com.github.pawelhenek.javaplayground.sel_and_boy.c_22;

import java.util.ListResourceBundle;

public class OwnPropertiesResourceBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {
                "abc",
                "def"
            },
            {
                "ghi",
                "jkl"
            }
        };
    }
}
