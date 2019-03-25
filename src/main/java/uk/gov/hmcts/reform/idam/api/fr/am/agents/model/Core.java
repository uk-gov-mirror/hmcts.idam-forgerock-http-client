/*
 * ForgeRock AM Agents API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.agents.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AccessTokenLifetimeSeconds;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AuthorizationCodeLifetimeSeconds;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.ClientName;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.ClientType;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.DefaultScopes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.RedirectionURIs;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.RefreshTokenLifetimeSeconds;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.Scopes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.Status;

/**
 * Core
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class Core {
  @JsonProperty("agentgroup")
  private String agentgroup = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("userpassword")
  private String userpassword = null;

  @JsonProperty("clientType")
  private ClientType clientType = null;

  @JsonProperty("redirectionUris")
  private RedirectionURIs redirectionUris = null;

  @JsonProperty("scopes")
  private Scopes scopes = null;

  @JsonProperty("defaultScopes")
  private DefaultScopes defaultScopes = null;

  @JsonProperty("clientName")
  private ClientName clientName = null;

  @JsonProperty("authorizationCodeLifetime")
  private AuthorizationCodeLifetimeSeconds authorizationCodeLifetime = null;

  @JsonProperty("refreshTokenLifetime")
  private RefreshTokenLifetimeSeconds refreshTokenLifetime = null;

  @JsonProperty("accessTokenLifetime")
  private AccessTokenLifetimeSeconds accessTokenLifetime = null;

  public Core agentgroup(String agentgroup) {
    this.agentgroup = agentgroup;
    return this;
  }

   /**
   * Add the client to a group to allow inheritance of property values from the group. &lt;br&gt;Changing the group will update inherited property values. &lt;br&gt;Remove the group by selecting the name and pressing &lt;code&gt;BACKSPACE&lt;/code&gt;. Inherited property values are copied to the client.
   * @return agentgroup
  **/
  @ApiModelProperty(value = "Add the client to a group to allow inheritance of property values from the group. <br>Changing the group will update inherited property values. <br>Remove the group by selecting the name and pressing <code>BACKSPACE</code>. Inherited property values are copied to the client.")
  public String getAgentgroup() {
    return agentgroup;
  }

  public void setAgentgroup(String agentgroup) {
    this.agentgroup = agentgroup;
  }

  public Core status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Core userpassword(String userpassword) {
    this.userpassword = userpassword;
    return this;
  }

   /**
   * Client secret. Used when the client authenticates to OpenAM.
   * @return userpassword
  **/
  @ApiModelProperty(value = "Client secret. Used when the client authenticates to OpenAM.")
  public String getUserpassword() {
    return userpassword;
  }

  public void setUserpassword(String userpassword) {
    this.userpassword = userpassword;
  }

  public Core clientType(ClientType clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Get clientType
   * @return clientType
  **/
  @ApiModelProperty(value = "")
  public ClientType getClientType() {
    return clientType;
  }

  public void setClientType(ClientType clientType) {
    this.clientType = clientType;
  }

  public Core redirectionUris(RedirectionURIs redirectionUris) {
    this.redirectionUris = redirectionUris;
    return this;
  }

   /**
   * Get redirectionUris
   * @return redirectionUris
  **/
  @ApiModelProperty(value = "")
  public RedirectionURIs getRedirectionUris() {
    return redirectionUris;
  }

  public void setRedirectionUris(RedirectionURIs redirectionUris) {
    this.redirectionUris = redirectionUris;
  }

  public Core scopes(Scopes scopes) {
    this.scopes = scopes;
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public Scopes getScopes() {
    return scopes;
  }

  public void setScopes(Scopes scopes) {
    this.scopes = scopes;
  }

  public Core defaultScopes(DefaultScopes defaultScopes) {
    this.defaultScopes = defaultScopes;
    return this;
  }

   /**
   * Get defaultScopes
   * @return defaultScopes
  **/
  @ApiModelProperty(value = "")
  public DefaultScopes getDefaultScopes() {
    return defaultScopes;
  }

  public void setDefaultScopes(DefaultScopes defaultScopes) {
    this.defaultScopes = defaultScopes;
  }

  public Core clientName(ClientName clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(value = "")
  public ClientName getClientName() {
    return clientName;
  }

  public void setClientName(ClientName clientName) {
    this.clientName = clientName;
  }

  public Core authorizationCodeLifetime(AuthorizationCodeLifetimeSeconds authorizationCodeLifetime) {
    this.authorizationCodeLifetime = authorizationCodeLifetime;
    return this;
  }

   /**
   * Get authorizationCodeLifetime
   * @return authorizationCodeLifetime
  **/
  @ApiModelProperty(value = "")
  public AuthorizationCodeLifetimeSeconds getAuthorizationCodeLifetime() {
    return authorizationCodeLifetime;
  }

  public void setAuthorizationCodeLifetime(AuthorizationCodeLifetimeSeconds authorizationCodeLifetime) {
    this.authorizationCodeLifetime = authorizationCodeLifetime;
  }

  public Core refreshTokenLifetime(RefreshTokenLifetimeSeconds refreshTokenLifetime) {
    this.refreshTokenLifetime = refreshTokenLifetime;
    return this;
  }

   /**
   * Get refreshTokenLifetime
   * @return refreshTokenLifetime
  **/
  @ApiModelProperty(value = "")
  public RefreshTokenLifetimeSeconds getRefreshTokenLifetime() {
    return refreshTokenLifetime;
  }

  public void setRefreshTokenLifetime(RefreshTokenLifetimeSeconds refreshTokenLifetime) {
    this.refreshTokenLifetime = refreshTokenLifetime;
  }

  public Core accessTokenLifetime(AccessTokenLifetimeSeconds accessTokenLifetime) {
    this.accessTokenLifetime = accessTokenLifetime;
    return this;
  }

   /**
   * Get accessTokenLifetime
   * @return accessTokenLifetime
  **/
  @ApiModelProperty(value = "")
  public AccessTokenLifetimeSeconds getAccessTokenLifetime() {
    return accessTokenLifetime;
  }

  public void setAccessTokenLifetime(AccessTokenLifetimeSeconds accessTokenLifetime) {
    this.accessTokenLifetime = accessTokenLifetime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Core core = (Core) o;
    return Objects.equals(this.agentgroup, core.agentgroup) &&
        Objects.equals(this.status, core.status) &&
        Objects.equals(this.userpassword, core.userpassword) &&
        Objects.equals(this.clientType, core.clientType) &&
        Objects.equals(this.redirectionUris, core.redirectionUris) &&
        Objects.equals(this.scopes, core.scopes) &&
        Objects.equals(this.defaultScopes, core.defaultScopes) &&
        Objects.equals(this.clientName, core.clientName) &&
        Objects.equals(this.authorizationCodeLifetime, core.authorizationCodeLifetime) &&
        Objects.equals(this.refreshTokenLifetime, core.refreshTokenLifetime) &&
        Objects.equals(this.accessTokenLifetime, core.accessTokenLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentgroup, status, userpassword, clientType, redirectionUris, scopes, defaultScopes, clientName, authorizationCodeLifetime, refreshTokenLifetime, accessTokenLifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Core {\n");
    
    sb.append("    agentgroup: ").append(toIndentedString(agentgroup)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userpassword: ").append(toIndentedString(userpassword)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    redirectionUris: ").append(toIndentedString(redirectionUris)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    defaultScopes: ").append(toIndentedString(defaultScopes)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    authorizationCodeLifetime: ").append(toIndentedString(authorizationCodeLifetime)).append("\n");
    sb.append("    refreshTokenLifetime: ").append(toIndentedString(refreshTokenLifetime)).append("\n");
    sb.append("    accessTokenLifetime: ").append(toIndentedString(accessTokenLifetime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

