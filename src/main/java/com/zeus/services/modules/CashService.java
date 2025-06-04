package com.zeus.services.modules;

import com.zeus.services.core.IService;

public class CashService implements IService {
    @Override
    public void pay() {
        System.out.println("Payment completed successfully with CashService");
    }
}
