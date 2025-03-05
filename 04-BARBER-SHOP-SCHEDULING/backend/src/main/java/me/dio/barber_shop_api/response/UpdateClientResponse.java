package me.dio.barber_shop_api.response;

public record UpdateClientResponse(
        Long id,
        String name,
        String email,
        String phone
) {}
