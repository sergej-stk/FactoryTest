package com.zeus;

import com.zeus.services.utils.ServiceUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your payment method:");
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();

        var service = ServiceUtils.generateService(name);
        service.pay();
    }
}