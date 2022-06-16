package fr.axopen.candidature.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Classe qui sert d'interface entre les properties présent dans le fichier application.properties.
 */
@Configuration
@ConfigurationProperties(prefix = "security")
public class SecurityApplicationProperties {

    /**
     * Secret du token JWT
     */
    private String secret;

    /**
     * Le temps d'expiration du token
     */
    private long expirationTime;

    /**
     * Le prefix du token une fois inséré dans le header HTTP
     */
    private String tokenPrefix;

    /**
     * Nom du header HTTP qui contient le token.
     */
    private String headerString;

    /**
     * Url qui permet de se créer un compte.
     */
    private String signUpUrl;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public String getHeaderString() {
        return headerString;
    }

    public void setHeaderString(String headerString) {
        this.headerString = headerString;
    }

    public String getSignUpUrl() {
        return signUpUrl;
    }

    public void setSignUpUrl(String signUpUrl) {
        this.signUpUrl = signUpUrl;
    }
}
