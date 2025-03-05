package me.dio.barber_shop_api.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import me.dio.barber_shop_api.mapper.IScheduleMapper;
import me.dio.barber_shop_api.request.SaveScheduleRequest;
import me.dio.barber_shop_api.response.SaveScheduleResponse;
import me.dio.barber_shop_api.service.IScheduleService;
import me.dio.barber_shop_api.service.query.IScheduleQueryService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("schedules")
@AllArgsConstructor
public class ScheduleController {

    private final IScheduleService service;
    private final IScheduleQueryService queryService;
    private final IScheduleMapper mapper;

    @PostMapping
    @ResponseStatus(CREATED)
    SaveScheduleResponse save(@RequestBody @Valid SaveScheduleRequest request){
        var entity = mapper.toEntity(request);
        service.save(entity);
        return mapper.toSaveResponse(entity);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    void delete(@PathVariable final long id){
        service.delete(id);
    }

}