package com.Mobitel.MobitelBack.dao;


import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mobitel.MobitelBack.model.Cart;



@Repository("cartDAO")

public class CartDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public CartDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public void addToCart(Cart cartitem)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cartitem);
		
	}
	public List<Cart> getCartItems(String uname)
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart where uname=:uname");
		query.setParameter("username", uname);
		@SuppressWarnings("Unchacked")
		List<Cart> list=query.list();
		return list;
		
	}
	public List<Cart> getCartDetails(String uname)
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart where username=:username");
		query.setParameter("username", uname);
		List<Cart> list=query.list();
		session.close();
		return list;
	}
	@Transactional
	public void deleteCartItem(Cart cart)
	{
		sessionFactory.getCurrentSession().delete(cart);
	}
	

	public Cart getCartItem(int cartItemid)
	{
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class,cartItemid);
		return cart;
	}
	
}