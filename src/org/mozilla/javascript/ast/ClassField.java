package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

import java.util.ArrayList;
import java.util.List;

public class ClassField extends InfixExpression implements ClassElement {
    private boolean isStatic = false;
    private AstNode name;
    private AstNode defaultValue;
    private Object nameKey;

    {
        type = Token.GETPROP;
    }

    public ClassField(AstNode name, AstNode defaultValue) {
        super(name, defaultValue);
        this.name = name;
        this.defaultValue = defaultValue;
    }

    public void setIsStatic() {
        isStatic = true;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public AstNode getName() {
        return name;
    }

    public Object getNameKey() {
        return nameKey;
    }

    public void setNameKey(Object nameKey) {
        this.nameKey = nameKey;
    }

    public AstNode getDefaultValue() {
        return defaultValue;
    }
}
