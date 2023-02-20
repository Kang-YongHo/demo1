package dlo.demo1.a_stream.application;

import dlo.demo1.SetupRepository;
import dlo.demo1.data.external.domain.ExternalData;
import dlo.demo1.data.external.dto.ExternalRequest;
import dlo.demo1.data.internal.InternalRepository;
import dlo.demo1.data.internal.application.DataMapper;
import dlo.demo1.data.internal.dto.InternalRequest;
import dlo.demo1.data.internal.type.Type;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class StreamService extends DataMapper {

    private final InternalRepository repository;
    private final SetupRepository setupRepository;
    private ModelMapper modelMapper;

    public void stream() {
        InternalRequest build = InternalRequest.builder()
            .type(Type.Y)
            .build();

        ExternalRequest map = modelMapper.map(build, ExternalRequest.class);
        List<ExternalData> externalData = setupRepository.findAllByType(map)
            .orElseThrow(NoSuchElementException::new);


    }
}
