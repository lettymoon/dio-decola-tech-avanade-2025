package me.dio.barber_shop_api.service;

import me.dio.barber_shop_api.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
