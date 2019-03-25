/*
 * ForgeRock IDM Users API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 5.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRoles;

/**
 * UserRolesQueryResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public class UserRolesQueryResult {
  @JsonProperty("result")
  private List<UserRoles> result = null;

  @JsonProperty("resultCount")
  private Integer resultCount = 0;

  @JsonProperty("pagedResultsCookie")
  private String pagedResultsCookie = null;

  @JsonProperty("totalPagedResultsPolicy")
  private String totalPagedResultsPolicy = "NONE";

  @JsonProperty("totalPagedResults")
  private Integer totalPagedResults = -1;

  @JsonProperty("remainingPagedResults")
  private Integer remainingPagedResults = -1;

  public UserRolesQueryResult result(List<UserRoles> result) {
    this.result = result;
    return this;
  }

  public UserRolesQueryResult addResultItem(UserRoles resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Array of matching items
   * @return result
  **/
  @ApiModelProperty(value = "Array of matching items")
  public List<UserRoles> getResult() {
    return result;
  }

  public void setResult(List<UserRoles> result) {
    this.result = result;
  }

  public UserRolesQueryResult resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Count of individual result items
   * @return resultCount
  **/
  @ApiModelProperty(value = "Count of individual result items")
  public Integer getResultCount() {
    return resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }

  public UserRolesQueryResult pagedResultsCookie(String pagedResultsCookie) {
    this.pagedResultsCookie = pagedResultsCookie;
    return this;
  }

   /**
   * Opaque cookie used by the server to keep track of the position in the search results
   * @return pagedResultsCookie
  **/
  @ApiModelProperty(value = "Opaque cookie used by the server to keep track of the position in the search results")
  public String getPagedResultsCookie() {
    return pagedResultsCookie;
  }

  public void setPagedResultsCookie(String pagedResultsCookie) {
    this.pagedResultsCookie = pagedResultsCookie;
  }

  public UserRolesQueryResult totalPagedResultsPolicy(String totalPagedResultsPolicy) {
    this.totalPagedResultsPolicy = totalPagedResultsPolicy;
    return this;
  }

   /**
   * Either NONE, EXACT, or ESTIMATE. Indicates the accuracy of the result count
   * @return totalPagedResultsPolicy
  **/
  @ApiModelProperty(value = "Either NONE, EXACT, or ESTIMATE. Indicates the accuracy of the result count")
  public String getTotalPagedResultsPolicy() {
    return totalPagedResultsPolicy;
  }

  public void setTotalPagedResultsPolicy(String totalPagedResultsPolicy) {
    this.totalPagedResultsPolicy = totalPagedResultsPolicy;
  }

  public UserRolesQueryResult totalPagedResults(Integer totalPagedResults) {
    this.totalPagedResults = totalPagedResults;
    return this;
  }

   /**
   * Total count of individual items
   * @return totalPagedResults
  **/
  @ApiModelProperty(value = "Total count of individual items")
  public Integer getTotalPagedResults() {
    return totalPagedResults;
  }

  public void setTotalPagedResults(Integer totalPagedResults) {
    this.totalPagedResults = totalPagedResults;
  }

  public UserRolesQueryResult remainingPagedResults(Integer remainingPagedResults) {
    this.remainingPagedResults = remainingPagedResults;
    return this;
  }

   /**
   * Count of individual items remaining
   * @return remainingPagedResults
  **/
  @ApiModelProperty(value = "Count of individual items remaining")
  public Integer getRemainingPagedResults() {
    return remainingPagedResults;
  }

  public void setRemainingPagedResults(Integer remainingPagedResults) {
    this.remainingPagedResults = remainingPagedResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRolesQueryResult userRolesQueryResult = (UserRolesQueryResult) o;
    return Objects.equals(this.result, userRolesQueryResult.result) &&
        Objects.equals(this.resultCount, userRolesQueryResult.resultCount) &&
        Objects.equals(this.pagedResultsCookie, userRolesQueryResult.pagedResultsCookie) &&
        Objects.equals(this.totalPagedResultsPolicy, userRolesQueryResult.totalPagedResultsPolicy) &&
        Objects.equals(this.totalPagedResults, userRolesQueryResult.totalPagedResults) &&
        Objects.equals(this.remainingPagedResults, userRolesQueryResult.remainingPagedResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, resultCount, pagedResultsCookie, totalPagedResultsPolicy, totalPagedResults, remainingPagedResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRolesQueryResult {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
    sb.append("    pagedResultsCookie: ").append(toIndentedString(pagedResultsCookie)).append("\n");
    sb.append("    totalPagedResultsPolicy: ").append(toIndentedString(totalPagedResultsPolicy)).append("\n");
    sb.append("    totalPagedResults: ").append(toIndentedString(totalPagedResults)).append("\n");
    sb.append("    remainingPagedResults: ").append(toIndentedString(remainingPagedResults)).append("\n");
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

