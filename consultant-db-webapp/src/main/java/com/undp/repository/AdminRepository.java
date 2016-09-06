package com.undp.repository;

import com.undp.entity.Dual;
import com.undp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by omib on 06/09/2016.
 */
@Repository
public interface AdminRepository extends JpaRepository<Dual,Integer>
{
    @Query("select 1 from Dual")
    int getSystemStatus();
}
