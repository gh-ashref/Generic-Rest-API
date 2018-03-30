package com.krendel.dao;

import com.krendel.model.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseDao<T extends BaseModel> extends JpaRepository<T, Serializable> {

}
