package dlo.demo1.data.external.dto;

import dlo.demo1.data.common.type.Type;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExternalRequest {

    private Type type;

    @Builder
    public ExternalRequest(Type type) {
        this.type = type;
    }
}
