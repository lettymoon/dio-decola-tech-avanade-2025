package me.dio.barber_shop_api.response;

public record ListClientResponse(
        Long id,
        String name,
        String email,
        String phone
) {}
