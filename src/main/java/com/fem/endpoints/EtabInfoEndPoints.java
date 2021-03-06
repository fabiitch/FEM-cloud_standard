package com.fem.endpoints;

import com.fem.ObjectifyLoader;
import com.fem.entities.EtabInfo;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import static com.googlecode.objectify.ObjectifyService.ofy;

@Api(name = "etab", version = "v1")
public class EtabInfoEndPoints {

    @ApiMethod(path = "test", httpMethod = ApiMethod.HttpMethod.GET)
    public EtabInfo test() {
        EtabInfo etab = new EtabInfo();
        etab.id = new Long(12345);
        etab.name = "kebab test";
        etab.email = "toot@toto.com";
        etab.type = "kebab";
        return etab;
    }

    @ApiMethod(path = "get", httpMethod = ApiMethod.HttpMethod.GET)
    public EtabInfo getAccount(@Named("id") long id) {
        ObjectifyLoader.loadEntity();
        System.out.println("recherche");

        EtabInfo etab = ofy().load().type(EtabInfo.class).id(id).now();
        if (etab == null) {
            System.out.println("not found");
            return null;
        } else {
            System.out.println("account found");
            return etab;
        }

    }

    @ApiMethod(path = "save", httpMethod = ApiMethod.HttpMethod.POST)
    public EtabInfo createAccount(EtabInfo etab) {
        ObjectifyLoader.loadEntity();

        ofy().save().entity(etab).now(); // Synchrone (enregistré mmédiatement)
        System.out.println("account create");
        return etab;
    }
}
