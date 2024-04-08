package com.example.demoapp.shared;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface WriteRepository<T, ID> extends Repository<T, ID> {
    T save(T entity);
}