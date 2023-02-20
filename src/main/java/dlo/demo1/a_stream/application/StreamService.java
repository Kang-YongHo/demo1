package dlo.demo1.a_stream.application;

import dlo.demo1.SetupRepository;
import dlo.demo1.data.external.domain.ExternalData;
import dlo.demo1.data.external.dto.ExternalRequest;
import dlo.demo1.data.internal.InternalRepository;
import dlo.demo1.data.internal.application.DataMapper;
import dlo.demo1.data.internal.dto.InternalDataCreateDto;
import dlo.demo1.data.common.type.Type;
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
    private final ModelMapper modelMapper;

    public List<InternalDataCreateDto> stream() {
        List<ExternalData> externalData = setupRepository.findAllByType(Type.Y)
            .orElseThrow(NoSuchElementException::new);

        return this.dataMapper(externalData);

    }

}
