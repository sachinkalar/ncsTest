package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OrderDAOInt;
import com.rays.dao.OrderDTO;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderDTO, OrderDAOInt> implements OrderServiceInt{
	
	@Autowired
	public OrderDAOInt dao;

	@Override
	public List serach(OrderDTO dto) {
		return dao.serach(dto);
	}

}
