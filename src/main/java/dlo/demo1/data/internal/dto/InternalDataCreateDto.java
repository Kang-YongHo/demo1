package dlo.demo1.data.internal.dto;

import dlo.demo1.data.common.type.Type;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InternalDataCreateDto {

    private String title;

    private String column1;
    private String column2;
    private String column3;
    private String column4;
    private String column5;
    private String column6;
    private String column7;
    private String column8;
    private String column9;
    private String column10;
    private String column11;
    private String column12;
    private String column13;
    private String column14;
    private String column15;
    private String column16;
    private String column17;
    private LocalDateTime localDateTime;
    private Type type;

    private List<InternalItem> items;
    @Getter
    @Setter
    private static class InternalItem{
        private String ItemColumn1;
        private String ItemColumn2;
        private String ItemColumn3;
        private String ItemColumn4;
        private String ItemColumn5;
        private String ItemColumn6;
        private String ItemColumn7;
        private String ItemColumn8;
        private String ItemColumn9;
        private String ItemColumn10;
        private String ItemColumn11;
        private String ItemColumn12;
        private String ItemColumn13;
        private String ItemColumn14;
        private String ItemColumn15;
        private String ItemColumn16;
        private String ItemColumn17;
    }

    @Builder
    public InternalDataCreateDto(String title, String column1, String column2, String column3,
        String column4, String column5, String column6, String column7, String column8,
        String column9,
        String column10, String column11, String column12, String column13, String column14,
        String column15, String column16, String column17, LocalDateTime localDateTime, Type type,
        List<InternalItem> items) {
        this.title = title;
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
        this.column4 = column4;
        this.column5 = column5;
        this.column6 = column6;
        this.column7 = column7;
        this.column8 = column8;
        this.column9 = column9;
        this.column10 = column10;
        this.column11 = column11;
        this.column12 = column12;
        this.column13 = column13;
        this.column14 = column14;
        this.column15 = column15;
        this.column16 = column16;
        this.column17 = column17;
        this.localDateTime = localDateTime;
        this.type = type;
        this.items = items;
    }
}
