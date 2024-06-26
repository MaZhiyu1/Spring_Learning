package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.controller.ContactController;
import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
@ApplicationScope
//@SessionScope
//@RequestScope
public class ContactService {
    //private static Logger log =  LoggerFactory.getLogger(ContactService.class);
    private int counter = 0;

    public ContactService(){
        System.out.println("Contact Service bean initialized");
    }
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO persist the data into DB table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
