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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * To avoid loading the JWKS URI content for every token signature verification, especially when the kid is not in the jwks content already cached, the JWKS content will be cache for a minimum period of time. This cache miss cache time defines the minimum of time the JWKS URI content is cache.
 */
@ApiModel(description = "To avoid loading the JWKS URI content for every token signature verification, especially when the kid is not in the jwks content already cached, the JWKS content will be cache for a minimum period of time. This cache miss cache time defines the minimum of time the JWKS URI content is cache.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class JWKsURIContentCacheMissCacheTime {
  @JsonProperty("inherited")
  private Boolean inherited = null;

  @JsonProperty("value")
  private Integer value = null;

  public JWKsURIContentCacheMissCacheTime inherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

   /**
   * Get inherited
   * @return inherited
  **/
  @ApiModelProperty(value = "")
  public Boolean isInherited() {
    return inherited;
  }

  public void setInherited(Boolean inherited) {
    this.inherited = inherited;
  }

  public JWKsURIContentCacheMissCacheTime value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWKsURIContentCacheMissCacheTime jwKsURIContentCacheMissCacheTime = (JWKsURIContentCacheMissCacheTime) o;
    return Objects.equals(this.inherited, jwKsURIContentCacheMissCacheTime.inherited) &&
        Objects.equals(this.value, jwKsURIContentCacheMissCacheTime.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWKsURIContentCacheMissCacheTime {\n");
    
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

