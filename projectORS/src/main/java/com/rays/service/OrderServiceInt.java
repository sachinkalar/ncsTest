package com.rays.service;

import java.util.List;

import com.rays.common.BaseServiceInt;
import com.rays.dao.OrderDTO;

public interface OrderServiceInt extends BaseServiceInt<OrderDTO>{
	
	public List serach(OrderDTO dto);
	
	

}
