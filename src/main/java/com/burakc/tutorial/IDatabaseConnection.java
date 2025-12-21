package com.burakc.tutorial;

public interface IDatabaseConnection<T> {
    void create(T t);
    void read(int id);
    void update(int id, T t);
    void delete(int id);
}
