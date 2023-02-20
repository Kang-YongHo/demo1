package dlo.demo1.data.internal.domain;

import dlo.demo1.data.common.type.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(indexes = {@Index(name = "indexed_title", columnList = "title")})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Builder
    public Order(Long id, String title, String column1, String column2, String column3,
        String column4,
        String column5, String column6, String column7, String column8, String column9,
        String column10,
        String column11, String column12, String column13, String column14, String column15,
        String column16, String column17, LocalDateTime localDateTime, Type type,
        List<OrderItem> orderItems) {
        this.id = id;
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
        this.orderItems = orderItems;
    }
}
