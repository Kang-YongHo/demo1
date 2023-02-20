package dlo.demo1.data.internal.dto;

import dlo.demo1.data.common.type.Type;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class InternalRequest {

    private Type type;

    @Builder
    public InternalRequest(Type type) {
        this.type = type;
    }
}
