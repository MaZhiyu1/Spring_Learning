package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ContactController {

    //private static Logger log =  LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @RequestMapping(value={ "contact"})
    public String displayContactPage() {
        return "contact.html";
    }

//    @PostMapping ("saveMsg")
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject, @RequestParam String message){
//
//        log.info("Name: "+ name);
//        log.info("mobileNum: "+ mobileNum);
//        log.info("email: "+ email);
//        log.info("subject: "+ subject);
//        log.info("message: "+ message);
//        return new ModelAndView("redirect:/contact");
//    }

    @PostMapping ("saveMsg")  //send msg to backEnd
    public ModelAndView saveMessage(Contact contact){
        //match the var name and Spring will convert into obj
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }

}
