package me.dio.barber_shop_api.service.query;

import me.dio.barber_shop_api.entity.ScheduleEntity;

import java.time.OffsetDateTime;
import java.util.List;

public interface IScheduleQueryService {

    ScheduleEntity findbyId(final long id);

    List<ScheduleEntity> findInMonth(final OffsetDateTime startAt, final OffsetDateTime endAt);

    void verifyIfScheduleExists(final OffsetDateTime startAt, final OffsetDateTime endAt);

}