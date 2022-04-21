package com.deliverfood.services;

import com.deliverfood.dao.CategoriaDao;
import com.deliverfood.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // para poder registrarlo como un Bean a la clase
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    public List<Categoria> findAll() {
        return categoriaDao.findAll();
    }
}
