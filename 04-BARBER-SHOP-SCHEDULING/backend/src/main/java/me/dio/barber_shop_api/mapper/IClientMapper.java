package me.dio.barber_shop_api.mapper;

import me.dio.barber_shop_api.entity.ClientEntity;
import me.dio.barber_shop_api.request.SaveClientRequest;
import me.dio.barber_shop_api.request.UpdateClientRequest;
import me.dio.barber_shop_api.response.ClientDetailResponse;
import me.dio.barber_shop_api.response.ListClientResponse;
import me.dio.barber_shop_api.response.SaveClientResponse;
import me.dio.barber_shop_api.response.UpdateClientResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}