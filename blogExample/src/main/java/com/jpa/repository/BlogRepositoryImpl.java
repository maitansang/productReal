package com.jpa.repository;

import com.jpa.model.MyBlog;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class BlogRepositoryImpl implements BlogRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<MyBlog> findAll() {
        TypedQuery<MyBlog> query = em.createQuery("select c from MyBlog c", MyBlog.class);
        return query.getResultList();
    }

    @Override
    public MyBlog findById(Long id) {
        TypedQuery<MyBlog> query = em.createQuery("select c from MyBlog c where  c.id=:id", MyBlog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(MyBlog model) {
        if(model.getId()!= null){
            em.merge(model);
        }else{
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        MyBlog myBlog =findById(id);
        if(myBlog != null){
            em.remove(myBlog);
        }
    }

}
