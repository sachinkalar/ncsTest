package com.rays.dao;

import java.util.List;

import com.rays.common.BaseDAOInt;

public interface OrderDAOInt  extends BaseDAOInt<OrderDTO>{
	
	public List serach(OrderDTO dto);
	

}
