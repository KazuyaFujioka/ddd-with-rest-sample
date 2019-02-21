package com.example.presentation.api;

import com.example.domain.model.ticket.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
class TicketRegisterController {

    Logger LOG = LoggerFactory.getLogger(TicketRegisterController.class);

    @PostMapping("register")
    void register(@Validated @RequestBody Ticket ticket, BindingResult result) {
        if(result.hasErrors()) {
            LOG.info("error count=" + result.getErrorCount());
            LOG.info("error message=" + result.getAllErrors());
            return;
        }
        LOG.info(ticket.toString());
    }
}