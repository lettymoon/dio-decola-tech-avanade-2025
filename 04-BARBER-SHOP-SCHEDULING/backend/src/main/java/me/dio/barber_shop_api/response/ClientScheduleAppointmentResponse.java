package me.dio.barber_shop_api.response;

import java.time.OffsetDateTime;

public record ClientScheduleAppointmentResponse(
        Long id,
        Integer day,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        Long clientId,
        String clientName
) {}
