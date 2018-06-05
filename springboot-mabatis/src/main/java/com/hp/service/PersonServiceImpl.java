package com.hp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hp.dao.PersonMapper;
import com.hp.model.Person;
import com.hp.universal.AbstractService;

/**
 * @author ck
 * @date 2018年5月30日 下午4:17:31
 */
@Service
@Transactional
public class PersonServiceImpl extends AbstractService<Person> implements PersonService{

//	@Autowired
//	private PersonMapper personMapper;
}
