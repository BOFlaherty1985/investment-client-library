package server.authenticationserver;

public class AuthenticationServerResponseBuilder {

    private String jwtToken;

    public static AuthenticationServerResponseBuilder authenticationServerResponseBuilder() {
        return new AuthenticationServerResponseBuilder();
    }

    public AuthenticationServerResponse build() {
        AuthenticationServerResponse response = new AuthenticationServerResponse();
        response.setJwtToken(jwtToken);
        return response;
    }

    public AuthenticationServerResponseBuilder jwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
}
