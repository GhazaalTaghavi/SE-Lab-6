package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

abstract class Address {
    protected int num;
    private TypeAddress Type;
    protected varType varType;

    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public int getNum() {
        return num;
    }

    public codeGenerator.varType getVarType() {
        return varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

    public abstract String toString();
}

class DirectAddress extends Address {
    public DirectAddress(int num, codeGenerator.varType varType, TypeAddress Type) {
        super(num, varType, Type);
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

class IndirectAddress extends Address {
    public IndirectAddress(int num, codeGenerator.varType varType, TypeAddress Type) {
        super(num, varType, Type);
    }

    @Override

    public String toString() {
        return "@" + num;
    }
}

class ImmediateAddress extends Address {
    public ImmediateAddress(int num, codeGenerator.varType varType, TypeAddress Type) {
        super(num, varType, Type);
    }

    @Override
    public String toString() {
        return "#" + num;
    }
}