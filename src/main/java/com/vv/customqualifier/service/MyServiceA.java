package com.vv.customqualifier.service;

import com.vv.customqualifier.domain.MyQualifier;
import org.springframework.stereotype.Service;

@Service("MyServiceA")
public class MyServiceA implements MyService {
    @Override
    public void performTask() {
        System.out.println("Service A performing task");
    }
}
