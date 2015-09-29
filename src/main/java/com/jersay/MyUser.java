package com.jersay;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myuser")
public class MyUser {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser() {
        User aUser = new User();
        aUser.setId("1");
        aUser.setName("aa");
        aUser.setAddress("Haidian");
        return aUser;
    }
}
