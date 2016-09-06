package com.undp.service;

import com.undp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by varalakshmi on 06/09/2016.
 */
@Service
public class AdminServiceImpl implements AdminService
{
    private final AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository)
    {
        this.adminRepository = adminRepository;
    }


    @Override
    public int getSystemStatus()
    {
        return adminRepository.getSystemStatus();
    }
}
