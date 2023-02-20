package dlo.demo1.data.common.type;

import lombok.Getter;

@Getter
public enum Type {
    Y("예스"),
    N("아니오");

    private final String desc;

    Type(String desc) {
        this.desc = desc;
    }

    public static Type random(int r){
        if(r==1) return Y;
        return N;
    }
}
