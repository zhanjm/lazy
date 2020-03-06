package com.lazy.service;

import com.lazy.dao.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Iterator;

public abstract class BaseService<T, ID extends Serializable, R extends BaseRepository<T, ID>>
        implements CrudService<T, ID> {
    @Autowired
    private R dao;

    @Override
    public void delete(ID id) {
        dao.deleteById(id);
    }

    @Override
    public void delete(Iterable<ID> ids) {
        Iterator<ID> iterator = ids.iterator();
        while (iterator.hasNext()) {
            ID id = iterator.next();
            dao.deleteById(id);
        }

    }

    @Override
    public void clear() {
        dao.deleteAllInBatch();
    }

    @Override
    public T insert(T record) {
        return dao.save(record);
    }
}
