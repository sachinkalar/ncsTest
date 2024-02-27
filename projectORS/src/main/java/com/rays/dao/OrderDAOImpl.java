package com.rays.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;


@Repository
public class OrderDAOImpl extends BaseDAOImpl<OrderDTO> implements OrderDAOInt{

	@PersistenceContext
	public EntityManager entity;
	
	@Override
	protected List<Predicate> getWhereClause(OrderDTO dto, CriteriaBuilder builder, Root<OrderDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<OrderDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List serach(OrderDTO dto) {
		CriteriaBuilder builder = entity.getCriteriaBuilder();
		CriteriaQuery<OrderDTO> cq = builder.createQuery(OrderDTO.class);
		Root<OrderDTO> qRoot = cq.from(OrderDTO.class);
		TypedQuery<OrderDTO> tq = entity.createQuery(cq);
		List list = tq.getResultList();
		return list;
	}
}

	