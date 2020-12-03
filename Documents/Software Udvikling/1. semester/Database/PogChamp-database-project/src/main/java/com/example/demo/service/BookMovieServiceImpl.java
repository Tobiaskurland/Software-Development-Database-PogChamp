package com.example.demo.service;

import com.example.demo.model.BookMovie;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

@Service
public class BookMovieServiceImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public void callStoredProcedure(BookMovie bookMovie){
        StoredProcedureQuery spInsert = entityManager.createStoredProcedureQuery("PogChamp.bookMovie");

        spInsert.registerStoredProcedureParameter("first_name", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("last_name", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("phone", int.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("adress", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("city", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("comment", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("order_status", int.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("movie", int.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("payment_date", String.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("quantity", int.class, ParameterMode.IN);
        spInsert.registerStoredProcedureParameter("payment_method", int.class, ParameterMode.IN);

        spInsert.setParameter("first_name", bookMovie.getFirst_name());
        spInsert.setParameter("last_name", bookMovie.getLast_name());
        spInsert.setParameter("phone", bookMovie.getPhone());
        spInsert.setParameter("email", bookMovie.getEmail());
        spInsert.setParameter("adress", bookMovie.getAdress());
        spInsert.setParameter("city", bookMovie.getCity());
        spInsert.setParameter("comment", bookMovie.getComment());
        spInsert.setParameter("order_status", bookMovie.getOrder_status());
        spInsert.setParameter("movie", bookMovie.getMovie());
        spInsert.setParameter("payment_date", bookMovie.getPayment_date());
        spInsert.setParameter("quantity", bookMovie.getQuantity());
        spInsert.setParameter("payment_method", bookMovie.getPayment_method());

        spInsert.execute();

    }
}
