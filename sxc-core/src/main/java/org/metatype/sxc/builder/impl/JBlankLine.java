package org.metatype.sxc.builder.impl;

import com.sun.codemodel.JFormatter;
import com.sun.codemodel.JStatement;

public class JBlankLine implements JStatement {
    public void state(JFormatter f) {
        f.nl();
    }
}