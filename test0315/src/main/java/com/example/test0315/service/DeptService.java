package com.example.test0315.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test0315.dao.DeptDAO;
import com.example.test0315.vo.DeptVO;

import lombok.Setter;

@Service
@Setter
public class DeptService {
	
	@Autowired
	private DeptDAO dao;
	
	public List<DeptVO> findAll(){
		return dao.findAll();
	}
}






















