package com.sdk.kswf.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Kevin
 *
 * @param <T>
 * @param <D>
 */
public interface GenericDao<T, D extends Serializable> {

	/*
	 * Insert and Update operations are combined into a single operation (e.g.
	 * Store) This is to let the ORM framework (not you) decide whether an
	 * object should be inserted or updated
	 */
}
