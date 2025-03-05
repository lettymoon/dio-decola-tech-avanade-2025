package me.dio.barber_shop_api.mapper;

import me.dio.barber_shop_api.entity.ScheduleEntity;
import me.dio.barber_shop_api.request.SaveScheduleRequest;
import me.dio.barber_shop_api.response.SaveScheduleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IScheduleMapper {


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "client.id", source = "clientId")
    ScheduleEntity toEntity(final SaveScheduleRequest request);

    @Mapping(target = "clientId", source = "client.id")
    SaveScheduleResponse toSaveResponse(final ScheduleEntity entity);

}