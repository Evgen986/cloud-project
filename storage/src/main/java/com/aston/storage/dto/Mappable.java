package com.aston.storage.dto;

import java.util.List;

/**
 * Интерфейс маппинга объектов.
 * @param <E> объект сущности.
 * @param <D>объект передачи данных.
 */
public interface Mappable <E, D>{
    D toDto(E entity);
    List<D> toDto(List<E> entity);
    E toEntity(D dto);
    List<E> toEntity(List<D> dtos);

}
