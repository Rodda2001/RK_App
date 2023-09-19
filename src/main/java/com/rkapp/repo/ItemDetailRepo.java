package com.rkapp.repo;


import com.rkapp.domain.ItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author saliya
 *
 *         Sep 20, 2023
 */
@Repository
public interface ItemDetailRepo extends JpaRepository<ItemDetail, Integer>{

}



