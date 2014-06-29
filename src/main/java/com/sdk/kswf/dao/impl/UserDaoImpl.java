package com.sdk.kswf.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.sdk.kswf.dao.UserDao;
import com.sdk.kswf.model.User;

/**
 * @author Kevin
 *
 */
public class UserDaoImpl extends GenericJPADao<User, Long> implements UserDao {

	public UserDaoImpl() {
		super();
	}

}
