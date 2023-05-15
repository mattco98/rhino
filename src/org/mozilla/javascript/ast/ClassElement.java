package org.mozilla.javascript.ast;

public interface ClassElement {
    void setIsStatic();

    boolean isStatic();

    Object getNameKey();

    void setNameKey(Object nameKey);
}
