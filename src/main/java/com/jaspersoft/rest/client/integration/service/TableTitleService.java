package com.jaspersoft.rest.client.integration.service;

import org.springframework.stereotype.Service;

/**
 * @author Alexander Krasnyanskiy
 */
@Service
public class TableTitleService {

    private String tableTitle = "Available users";

    public String getTitle() {
        return tableTitle;
    }

    public void setTableTitle(String tableTitle) {
        this.tableTitle = tableTitle;
    }
}
