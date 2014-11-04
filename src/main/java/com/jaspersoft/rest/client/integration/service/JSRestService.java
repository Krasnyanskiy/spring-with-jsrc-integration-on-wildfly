package com.jaspersoft.rest.client.integration.service;

import com.jaspersoft.jasperserver.jaxrs.client.core.JasperserverRestClient;
import com.jaspersoft.jasperserver.jaxrs.client.core.RestClientConfiguration;
import com.jaspersoft.jasperserver.jaxrs.client.core.Session;
import org.springframework.stereotype.Service;

/**
 * @author Alexander Krasnyanskiy
 */
@Service
public class JSRestService {

    private static final String URI = /*"http://172.28.146.32:8080/jasperserver-pro"*/ "http://54.226.0.218/jasperserver-pro";
    private Session session;

    /**
     * Creates Client configuration and return a Client session.
     *
     * @return {@link Session}
     */
    public Session configure() {
        if (session == null) {
            RestClientConfiguration config = new RestClientConfiguration(URI);
            JasperserverRestClient client = new JasperserverRestClient(config);
            session = client.authenticate("superuser", "superuser");
            return session;
        } else {
            return session;
        }
    }
}
