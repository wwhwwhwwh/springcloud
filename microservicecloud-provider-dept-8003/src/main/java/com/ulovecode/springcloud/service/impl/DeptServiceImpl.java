package com.ulovecode.springcloud.service.impl;

import com.ulovecode.springcloud.dao.DeptDao;
import com.ulovecode.springcloud.entities.Dept;
import com.ulovecode.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author JackZhu
 * @since 2018/05/02
 */
@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
