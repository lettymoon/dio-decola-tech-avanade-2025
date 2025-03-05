package me.dio.barber_shop_api.response;

import java.util.List;

public record ScheduleAppointmentMonthResponse(
        int year,
        int month,
        List<ClientScheduleAppointmentResponse> scheduledAppointments
) {}