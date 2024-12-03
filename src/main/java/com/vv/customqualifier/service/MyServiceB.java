package com.vv.customqualifier.service;

import com.vv.customqualifier.domain.MyQualifier;
import com.vv.customqualifier.domain.ServiceB;
import org.springframework.stereotype.Service;

@Service
@ServiceB
public class MyServiceB implements MyService {
    @Override
    public void performTask() {
        System.out.println("Service B performing task");
    }
}
