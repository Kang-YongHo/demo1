package dlo.demo1.data.external.type;

import lombok.Getter;

@Getter
public enum Type {
    Y("예스"),
    N("아니오");

    private final String desc;

    Type(String desc) {
        this.desc = desc;
    }

    public static Type random(int randomNo){
        if(randomNo == 1) return Type.N;
        return Type.Y;
    }
}
