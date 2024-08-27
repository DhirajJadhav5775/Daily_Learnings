package com.dhiraj.SpringBootDemo2.repo;

import com.dhiraj.SpringBootDemo2.model.G63;
import org.springframework.stereotype.Repository;

@Repository
public class G63Repository
{

    public void save(G63 g63)
    {
        System.out.println("Saved In Database");
    }
}
