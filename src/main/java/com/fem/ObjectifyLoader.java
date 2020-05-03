package com.fem;

import com.fem.entities.EtabInfo;
import com.fem.entities.FemUser;
import com.googlecode.objectify.ObjectifyService;

public class ObjectifyLoader {

    public static void loadEntity(){
        System.out.println("passe objectify");
        ObjectifyService.register(FemUser.class); // Fait connaître votre classe-entité à Objectify
        ObjectifyService.register(EtabInfo.class);
    }
}
