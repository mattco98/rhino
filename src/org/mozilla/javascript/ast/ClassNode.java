package org.mozilla.javascript.ast;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;

import java.util.ArrayList;
import java.util.List;

public class ClassNode extends ScriptNode {
    private Name className = null;
    private AstNode extendsName = null;
    private FunctionNode constructor = null;
    private List<ClassMethod> methods = new ArrayList<>();
    private List<ClassField> fields = new ArrayList<>();
    private Node parentFn = null;

    {
        type = Token.CLASS;
    }

    public ClassNode() {

    }

    public ClassNode(int pos) {
        super(pos);
    }

    public ClassNode(int pos, Name name) {
        super(pos);
        className = name;
        if (name != null)
            name.setParent(this);
    }

    public Name getClassName() {
        return className;
    }

    public void setClassName(Name name) {
        this.className = name;
    }

    public void setExtendsNode(AstNode name) {
        this.extendsName = name;
    }

    public AstNode getExtendsName() {
        return extendsName;
    }

    public FunctionNode getConstructor() {
        return constructor;
    }

    public void setConstructor(FunctionNode constructor) {
        this.constructor = constructor;
    }

    public List<ClassMethod> getMethods() {
        return methods;
    }

    public void setMethods(List<ClassMethod> methods) {
        this.methods = methods;
    }

    public List<ClassField> getFields() {
        return fields;
    }

    public void setFields(List<ClassField> fields) {
        this.fields = fields;
    }

    public Node getParentFn() {
        return parentFn;
    }

    public void setParentFn(Node parentFn) {
        this.parentFn = parentFn;
    }
}
