//
// This file generated by rdl 1.4.10. Do not modify!
//
package com.yahoo.athenz.zms;

import com.yahoo.rdl.*;
import java.util.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.WebApplicationException;

public final class GetSignedDomainsResult {
    private ResourceContext context;
    private int code; //normal result

    GetSignedDomainsResult(ResourceContext context) {
        this.context = context;
        this.code = 0;
    }

    public boolean isAsync() {
        return false;
    }

    public void done(int code, SignedDomains signedDomains, String tag) {
        Response resp = Response.status(code).entity(signedDomains)
            .header("ETag", tag)
            .build();
        throw new WebApplicationException(resp);
    }

    public void done(int code) {
        done(code, new ResourceError().code(code).message(ResourceException.codeToString(code)), "");
    }

    public void done(int code, String tag) {
        done(code, new ResourceError().code(code).message(ResourceException.codeToString(code)), tag);
    }

    public void done(int code, Object entity, String tag) {
        this.code = code;
        //to do: check if the exception is declared, and that the entity is of the declared type
        WebApplicationException err = new WebApplicationException(Response.status(code).entity(entity)
            .header("ETag", tag)
          .build());
        throw err; //not optimal
    }

}
