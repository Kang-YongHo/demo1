package dlo.demo1.data.internal.type;

import lombok.Getter;

@Getter
public enum Type {
    Y("예스"),
    N("아니오");

    private final String desc;

    Type(String desc) {
        this.desc = desc;
    }
}
