package com.zeus.services.modules;

import com.zeus.services.core.IService;

public class ECService implements IService {
    @Override
    public void pay() {
        System.out.println("Payment completed successfully with ECService");
    }
}
