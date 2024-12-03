package com.vv.customqualifier.service;

import com.vv.customqualifier.domain.MyQualifier;
import org.springframework.stereotype.Service;

@Service("MyServiceB")
public class MyServiceB implements MyService {
    @Override
    public void performTask() {
        System.out.println("Service B performing task");
    }
}
