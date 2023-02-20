package dlo.demo1.data.internal.application;

import dlo.demo1.data.external.domain.ExternalData;
import dlo.demo1.data.internal.dto.InternalDataCreateDto;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class DataMapper {

    @Autowired
    public ModelMapper modelMapper;
    protected List<InternalDataCreateDto> dataMapper(List<ExternalData> list){

        return list.stream()
            .map(x -> modelMapper.map(x, InternalDataCreateDto.class))
            .toList();


    }
}
