package me.dio.barber_shop_api.response;

import java.time.OffsetDateTime;

public record SaveScheduleResponse(
        Long id,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        Long clientId
) {}