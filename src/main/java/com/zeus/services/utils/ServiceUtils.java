package com.zeus.services.utils;

import com.zeus.services.modules.CashService;
import com.zeus.services.modules.ECService;
import com.zeus.services.modules.EPaymentService;
import com.zeus.services.core.IService;

public class ServiceUtils {
    public static IService generateService(String name) {
        return switch (name) {
            case "epayment" -> new EPaymentService();
            case "cash" -> new CashService();
            case "ec" -> new ECService();
            default -> throw new IllegalArgumentException("Invalid service name: " + name);
        };
    }
}
