package dlo.demo1.test;

import static org.junit.jupiter.api.Assertions.*;

import dlo.demo1.SetupService;
import dlo.demo1.a_stream.application.StreamService;
import dlo.demo1.common.MockMvcTest;
import dlo.demo1.data.external.domain.ExternalData;
import dlo.demo1.data.internal.application.InternalService;
import dlo.demo1.data.internal.dto.InternalDataCreateDto;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@MockMvcTest
class StreamServiceTest {

    @Autowired
    SetupService setupService;

    @Autowired
    StreamService streamService;

    @Autowired
    InternalService internalService;

    @BeforeEach
    void setUp() {
        setupService.setup();
    }

    @Test
    @DisplayName("스트림으로 매핑 후 저장")
    void stream() {
        List<ExternalData> all = setupService.findAll();
        List<InternalDataCreateDto> stream = streamService.stream();
        internalService.save(stream);
    }
}