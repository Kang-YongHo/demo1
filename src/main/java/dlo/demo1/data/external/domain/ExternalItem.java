package dlo.demo1.data.external.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ExternalItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
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
    @ManyToOne
    @JoinColumn(name = "external_data_id")
    private ExternalData externalData;

    @Builder
    public ExternalItem(Long id, String itemColumn1, String itemColumn2, String itemColumn3,
        String itemColumn4, String itemColumn5, String itemColumn6, String itemColumn7,
        String itemColumn8, String itemColumn9, String itemColumn10, String itemColumn11,
        String itemColumn12, String itemColumn13, String itemColumn14, String itemColumn15,
        String itemColumn16, String itemColumn17, ExternalData externalData) {
        this.id = id;
        ItemColumn1 = itemColumn1;
        ItemColumn2 = itemColumn2;
        ItemColumn3 = itemColumn3;
        ItemColumn4 = itemColumn4;
        ItemColumn5 = itemColumn5;
        ItemColumn6 = itemColumn6;
        ItemColumn7 = itemColumn7;
        ItemColumn8 = itemColumn8;
        ItemColumn9 = itemColumn9;
        ItemColumn10 = itemColumn10;
        ItemColumn11 = itemColumn11;
        ItemColumn12 = itemColumn12;
        ItemColumn13 = itemColumn13;
        ItemColumn14 = itemColumn14;
        ItemColumn15 = itemColumn15;
        ItemColumn16 = itemColumn16;
        ItemColumn17 = itemColumn17;
        this.externalData = externalData;
    }
}