package com.persistance.dao;

public interface IDao<T> {

    T findById(Integer id);

    T persist(T object);

    void remove(Integer id);

    T update(T object);
}