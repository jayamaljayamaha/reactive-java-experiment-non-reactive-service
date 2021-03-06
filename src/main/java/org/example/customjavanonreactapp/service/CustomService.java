package org.example.customjavanonreactapp.service;

import org.example.customjavanonreactapp.modal.Data;
import org.springframework.stereotype.Service;

@Service
public class CustomService {
    public Data getData(long threadId, long time) {
        try {
            Thread.sleep(1000);
            return Data.builder().data("Some Data").threadId(threadId).requestCameTime(time).build();
        } catch (InterruptedException e) {
            throw new RuntimeException("error happened");
        }
    }
}
