package api;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class library extends ResourceConfig {
    public LibraryApplication() {
        packages("api");
    }
}
