package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.model.Person;
import com.hp.service.PersonService;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

/**
 * @author ck
 * @date 2018年5月30日 下午4:11:46
 */
@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("getById")
	public ResponseEntity<Person> getById(String id){
		Person person = personService.selectById(id);
		return ResponseEntity.ok(person);
	}
	
	@PostMapping("insert")
	public ResponseEntity<?> insert(@RequestBody Person person){
		 personService.insert(person);
		return  ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("getByCon")
	public ResponseEntity<List<Person>> getByCon(String name){
		//Person person = personService.selectBy("name", name);
		Condition condition = new Condition(Person.class);
		condition.createCriteria().andEqualTo("name", name);
		List<Person> persons = personService.selectByCondition(condition);
		return ResponseEntity.ok(persons);
	}
}
