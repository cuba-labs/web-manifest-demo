package com.company.demo.web.manifest;

import com.haulmont.cuba.web.sys.CubaBootstrapListener;
import com.vaadin.server.BootstrapPageResponse;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

public class CustomBootstrapListener extends CubaBootstrapListener {
    @Override
    public void modifyBootstrapPage(BootstrapPageResponse response) {
        super.modifyBootstrapPage(response);

        // Add <link rel="manifest" href="/app/VAADIN/manifest.json"> to HEAD
        response.getDocument().head()
                .appendElement("link")
                .attr("rel", "manifest")
                .attr("href", "/app/VAADIN/manifest.json");
    }
}