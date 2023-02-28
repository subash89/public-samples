package hellojaxrs;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.RequestBean;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.validation.constraints.NotEmpty;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
@SecurityScheme(name = "bearerToken", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class HelloResource {

    @Path("/hello")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Tag(name = "simple auth")
    public HttpResponse getHelloLWC211(
            @Parameter(description = "aa", required = true) @HeaderParam("fsreqid") @NotEmpty String fsreqid) {
        return HttpResponse.ok();
    }

}