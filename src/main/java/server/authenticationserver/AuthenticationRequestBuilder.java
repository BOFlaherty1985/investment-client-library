package server.authenticationserver;

public class AuthenticationRequestBuilder {

    private String username;
    private String password;

    public static AuthenticationRequestBuilder authenticationRequestBuilder() {
        return new AuthenticationRequestBuilder();
    }

    public AuthenticationRequest build() {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest();
        authenticationRequest.setUsername(username);
        authenticationRequest.setPassword(password);
        return authenticationRequest;
    }

    public AuthenticationRequestBuilder username(String username) {
        this.username = username;
        return this;
    }

    public AuthenticationRequestBuilder password(String password) {
        this.password = password;
        return this;
    }
}
