package com.sdk.kswf.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Kevin
 * for  hql  to all common grud operation
 * @param <T> entity class
 * @param <D> search param like id, name
 */
@Transactional
public class GenericJPADao<T, D extends Serializable> implements
		com.sdk.kswf.dao.GenericDao<T, D> {
	

}

