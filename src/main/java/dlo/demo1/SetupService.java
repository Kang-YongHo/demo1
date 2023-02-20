package dlo.demo1;

import dlo.demo1.data.external.domain.ExternalData;
import dlo.demo1.data.external.type.Type;
import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetupService {

    private final SetupRepository setupRepository;

    @PostConstruct
    public void setup() {
        Random random = new Random();
        int randomNo = random.nextInt(2 - 1) + 1;

        List<ExternalData> list = IntStream.range(0, 1000)
            .mapToObj(i -> ExternalData.builder()
                .title("타이틀" + i)
                .column1("컬럼1_번호" + i)
                .column2("컬럼2_번호" + i)
                .column3("컬럼3_번호" + i)
                .column4("컬럼4_번호" + i)
                .column5("컬럼5_번호" + i)
                .column6("컬럼6_번호" + i)
                .column7("컬럼7_번호" + i)
                .column8("컬럼8_번호" + i)
                .column9("컬럼9_번호" + i)
                .column10("컬럼10_번호" + i)
                .column11("컬럼11_번호" + i)
                .column12("컬럼12_번호" + i)
                .column13("컬럼13_번호" + i)
                .column14("컬럼14_번호" + i)
                .column15("컬럼15_번호" + i)
                .column16("컬럼16_번호" + i)
                .column17("컬럼17_번호" + i)
                .localDateTime(LocalDateTime.now())
                .type(Type.random(randomNo))
                .build())
            .toList();

        setupRepository.saveAll(list);
    }

}
