package com.rkapp.service.impl;

import com.rkapp.domain.ItemDetail;
import com.rkapp.repo.ItemDetailRepo;
import com.rkapp.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemDetailServiceImpl implements ItemDetailService {
    @Autowired
    ItemDetailRepo itemDetailRepo;





    public ArrayList<ItemDetail> getItemList(){
        return (ArrayList<ItemDetail>) itemDetailRepo.findAll();

    }

}
