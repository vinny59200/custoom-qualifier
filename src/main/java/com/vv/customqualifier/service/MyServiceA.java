package com.vv.customqualifier.service;

import com.vv.customqualifier.domain.MyQualifier;
import com.vv.customqualifier.domain.ServiceA;
import org.springframework.stereotype.Service;

@Service
@ServiceA
public class MyServiceA implements MyService {
    @Override
    public void performTask() {
        System.out.println("Service A performing task");
    }
}
