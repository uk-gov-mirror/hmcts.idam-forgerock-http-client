/*
 * Forgerock AM Authentication Chain API
 * An OAuth2 Client for Forgerock AM based on tests
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.am.authenticate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Keeps the authentication authId and callbacks
 */
@ApiModel(description = "Keeps the authentication authId and callbacks")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-28T12:12:27.878Z")
public class AuthenticationChain {
  @JsonProperty("tokenId")
  private String tokenId = null;

  @JsonProperty("successUrl")
  private String successUrl = null;

  @JsonProperty("realm")
  private String realm = null;

  @JsonProperty("authId")
  private String authId = null;

  @JsonProperty("stage")
  private String stage = null;

  @JsonProperty("callbacks")
  private List<Callback> callbacks = null;

  public AuthenticationChain tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Token ID, received when the chain is complete
   * @return tokenId
  **/
  @ApiModelProperty(value = "Token ID, received when the chain is complete")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public AuthenticationChain successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Success Url, received when the chain is complete
   * @return successUrl
  **/
  @ApiModelProperty(value = "Success Url, received when the chain is complete")
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public AuthenticationChain realm(String realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Realm name, received when the chain is complete
   * @return realm
  **/
  @ApiModelProperty(value = "Realm name, received when the chain is complete")
  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public AuthenticationChain authId(String authId) {
    this.authId = authId;
    return this;
  }

   /**
   * Identitfier of the current authentication chain
   * @return authId
  **/
  @ApiModelProperty(value = "Identitfier of the current authentication chain")
  public String getAuthId() {
    return authId;
  }

  public void setAuthId(String authId) {
    this.authId = authId;
  }

  public AuthenticationChain stage(String stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Identitfier of the current stage of the chain
   * @return stage
  **/
  @ApiModelProperty(value = "Identitfier of the current stage of the chain")
  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public AuthenticationChain callbacks(List<Callback> callbacks) {
    this.callbacks = callbacks;
    return this;
  }

  public AuthenticationChain addCallbacksItem(Callback callbacksItem) {
    if (this.callbacks == null) {
      this.callbacks = new ArrayList<>();
    }
    this.callbacks.add(callbacksItem);
    return this;
  }

   /**
   * List of callbacks required for this chain
   * @return callbacks
  **/
  @ApiModelProperty(value = "List of callbacks required for this chain")
  public List<Callback> getCallbacks() {
    return callbacks;
  }

  public void setCallbacks(List<Callback> callbacks) {
    this.callbacks = callbacks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationChain authenticationChain = (AuthenticationChain) o;
    return Objects.equals(this.tokenId, authenticationChain.tokenId) &&
        Objects.equals(this.successUrl, authenticationChain.successUrl) &&
        Objects.equals(this.realm, authenticationChain.realm) &&
        Objects.equals(this.authId, authenticationChain.authId) &&
        Objects.equals(this.stage, authenticationChain.stage) &&
        Objects.equals(this.callbacks, authenticationChain.callbacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, successUrl, realm, authId, stage, callbacks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationChain {\n");

    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
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

