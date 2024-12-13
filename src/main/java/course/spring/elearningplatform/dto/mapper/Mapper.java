package course.spring.elearningplatform.dto.mapper;

import org.springframework.beans.BeanUtils;

public interface Mapper<T, K> {
    T mapCreateDtoToEntity(K dto);
    K mapEntityToDto(T entity);
}
