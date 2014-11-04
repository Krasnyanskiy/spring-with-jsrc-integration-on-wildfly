package com.jaspersoft.rest.client.integration.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author Alexander Krasnyanskiy
*/
@Service
public class ContextService {

    @Resource
    ApplicationContext context;

    public ApplicationContext getCtx() {
        return context;
    }
}
