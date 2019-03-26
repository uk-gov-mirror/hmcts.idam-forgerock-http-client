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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A collection of type objects in response to the request
 */
@ApiModel(description = "A collection of type objects in response to the request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public class AmAgentGetCreatableTypes {
  @JsonProperty("result")
  private List<RestsmsType> result = null;

  public AmAgentGetCreatableTypes result(List<RestsmsType> result) {
    this.result = result;
    return this;
  }

  public AmAgentGetCreatableTypes addResultItem(RestsmsType resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * The array of type results
   * @return result
  **/
  @ApiModelProperty(value = "The array of type results")
  public List<RestsmsType> getResult() {
    return result;
  }

  public void setResult(List<RestsmsType> result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmAgentGetCreatableTypes amAgentGetCreatableTypes = (AmAgentGetCreatableTypes) o;
    return Objects.equals(this.result, amAgentGetCreatableTypes.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmAgentGetCreatableTypes {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

