package com.dhiraj.SpringBootDemo2.service;

import com.dhiraj.SpringBootDemo2.model.G63;
import com.dhiraj.SpringBootDemo2.repo.G63Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class g63Service
{
    @Autowired
    private G63Repository repo;

    public void addG63(G63 g63)
    {
        //System.out.println("Method Called");
        repo.save(g63);
    }
    public boolean isGoodforRacing(G63 g63)
    {
        return true;
    }
}
