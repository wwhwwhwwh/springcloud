package com.ulovecode.springcloud.service;

import com.ulovecode.springcloud.entities.Dept;

import java.util.List;

/**
 * @author JackZhu
 * @since 2018/05/02
 */
public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
