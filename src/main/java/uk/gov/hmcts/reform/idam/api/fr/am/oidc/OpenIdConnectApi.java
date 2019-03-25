package uk.gov.hmcts.reform.idam.api.fr.am.oidc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmAuthenticateToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.JsonWebKeySet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:58.839Z")
public interface OpenIdConnectApi extends ApiClient.Api {

  /**
   * Call OAuth2Authorize specifically to get the authorization code
   *
   * @param params
   * @return The Auth Code
   */
  default String getAuthorizationCode(GetAuthorizationCodeParams params) {
    Response feignResponse = oauth2Authorize(params.get("cookie"),
            params.get("token_id"), params.get("scope"),
            new OpenIdConnectApi.OAuth2AuthorizeParams()
                    .clientId(params.get("client_id"))
                    .responseType("code")
                    .realm(params.get("realm"))
                    .decision("Allow")
                    .redirectUri(params.get("redirect_uri")));

    HttpStatus responseStatus = HttpStatus.valueOf(feignResponse.status());

    if (responseStatus.is4xxClientError() || responseStatus.is5xxServerError()) {
      throw new ResponseStatusException(HttpStatus.valueOf(feignResponse.status()));
    }

    return UriComponentsBuilder.fromUriString(feignResponse.headers()
            .get(HttpHeaders.LOCATION)
            .stream().findFirst().orElse(""))
            .build()
            .getQueryParams().getFirst("code");
  }


  /**
   * A convenience class for generating query parameters for the
   * <code>getAuthorizationCode</code> method in a fluent style.
   */
  public static class GetAuthorizationCodeParams extends HashMap<String, String> {
    public GetAuthorizationCodeParams cookie(final String value) {
      put("cookie", value);
      return this;
    }

    public GetAuthorizationCodeParams clientId(final String value) {
      put("client_id", value);
      return this;
    }

    public GetAuthorizationCodeParams redirectUri(final String value) {
      put("redirect_uri", value);
      return this;
    }

    public GetAuthorizationCodeParams tokenId(final String value) {
      put("token_id", value);
      return this;
    }

    public GetAuthorizationCodeParams realm(final String value) {
      put("realm", value);
      return this;
    }

    public GetAuthorizationCodeParams scope(final String value) {
      put("scope", value);
      return this;
    }
  }

  /**
   * Request Access Token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param authorization  (required)
    * @param grantType The OAuth2 Grant Type (required)
    * @param realm  (optional)
    * @param code The (optional)
    * @param redirectUri The (optional)
    * @param clientId The (optional)
    * @param clientSecret The (optional)
    * @param scope The (optional)
    * @param username The (optional)
    * @param password The (optional)
   * @return AmToken
   */
  @RequestLine("POST /oauth2/access_token?realm={realm}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  AmToken accessToken(@Param("authorization") String authorization, @Param("grant_type") String grantType, @Param("realm") String realm, @Param("code") String code, @Param("redirect_uri") String redirectUri, @Param("client_id") String clientId, @Param("client_secret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password);

  /**
   * Request Access Token For Realm
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param realm  (required)
    * @param authorization  (required)
    * @param grantType The OAuth2 Grant Type (required)
    * @param code The (optional)
    * @param redirectUri The (optional)
    * @param clientId The (optional)
    * @param clientSecret The (optional)
    * @param scope The (optional)
    * @param username The (optional)
    * @param password The (optional)
   * @return AmToken
   */
  @RequestLine("POST /oauth2/{realm}/access_token")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  AmToken accessTokenForRealm(@Param("realm") String realm, @Param("authorization") String authorization, @Param("grant_type") String grantType, @Param("code") String code, @Param("redirect_uri") String redirectUri, @Param("client_id") String clientId, @Param("client_secret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password);

  /**
   * Access Token Info
   * Returns information about the supplied token
    * @param authorization  (required)
   * @return feign.Response
   */
  @RequestLine("GET /oauth2/tokeninfo")
  @Headers({
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Map<String, Object> getAccessTokenInfo(@Param("authorization") String authorization);

  /**
   * Get JWKS
   * Retrieves the JSON Web Key Set
    * @param realm  (optional)
   * @return JsonWebKeySet
   */
  @RequestLine("GET /oauth2/connect/jwk_uri?realm={realm}")
  @Headers({
    "Accept: application/json",
  })
  JsonWebKeySet getJsonWebKeySet(@Param("realm") String realm);

  /**
   * Request ID Token Info
   * Partner makes a request to the id token info endpoint to get information about the token presented 
    * @param authorization  (required)
    * @param realm  (optional)
    * @param claims Claims required in the result (optional)
    * @param idToken The id token (optional)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/idtokeninfo?realm={realm}&claims={claims}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Map<String, Object> idTokenInfo(@Param("authorization") String authorization, @Param("realm") String realm, @Param("claims") String claims, @Param("id_token") String idToken);

  /**
   * Request ID Token Info
   * Partner makes a request to the id token info endpoint to get information about the token presented 
    * @param xOpenAMUsername The Username (required)
    * @param xOpenAMPassword The Password (required)
    * @param realm  (optional)
   * @return AmAuthenticateToken
   */
  @RequestLine("POST /json/authenticate?realm={realm}")
  @Headers({
    "Accept: application/json",
    "X-OpenAM-Username: {xOpenAMUsername}",
    "X-OpenAM-Password: {xOpenAMPassword}"
  })
  AmAuthenticateToken jsonAuthenticate(@Param("xOpenAMUsername") String xOpenAMUsername, @Param("xOpenAMPassword") String xOpenAMPassword, @Param("realm") String realm);

  /**
   * OpenID Connect Authorize
   * Use token ID to get Authorization code
   *
   * @param cookie  (optional)
   * @param csrf The ID of the token (optional)
   * @param scope The requred scopes (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   <li>clientId -  (optional)</li>
   *   <li>redirectUri -  (optional)</li>
   *   <li>state -  (optional)</li>
   *   <li>responseType -  (optional, default to code)</li>
   *   <li>decision -  (optional, default to Allow)</li>
   *   </ul>
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/authorize?realm={realm}&client_id={clientId}&redirect_uri={redirectUri}&state={state}&response_type={responseType}&decision={decision}")
  @Headers({
  "Content-Type: application/x-www-form-urlencoded",
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  Response oauth2Authorize(@Param("cookie") String cookie, @Param("csrf") String csrf, @Param("scope") String scope, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>oauth2Authorize</code> method in a fluent style.
   */
  public static class OAuth2AuthorizeParams extends HashMap<String, Object> {
    public OAuth2AuthorizeParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
    public OAuth2AuthorizeParams clientId(final String value) {
      put("client_id", EncodingUtils.encode(value));
      return this;
    }
    public OAuth2AuthorizeParams redirectUri(final String value) {
      put("redirect_uri", EncodingUtils.encode(value));
      return this;
    }
    public OAuth2AuthorizeParams state(final String value) {
      put("state", EncodingUtils.encode(value));
      return this;
    }
    public OAuth2AuthorizeParams responseType(final String value) {
      put("response_type", EncodingUtils.encode(value));
      return this;
    }
    public OAuth2AuthorizeParams decision(final String value) {
      put("decision", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Request Info For User of the Authorization token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param authorization  (required)
    * @param realm  (optional)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/userinfo?realm={realm}")
  @Headers({
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Map<String, Object> userInfo(@Param("authorization") String authorization, @Param("realm") String realm);

  /**
   * Request Info For User of the Authorization token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param authorization  (required)
    * @param realm  (required)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/{realm}/userinfo")
  @Headers({
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Map<String, Object> userInfoForRealm(@Param("authorization") String authorization, @Param("realm") String realm);
}
