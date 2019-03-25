/*
 * ForgeRock Roles API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.ManagedAssignmentsItemsRefProperties;

/**
 * RoleAssignments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.261Z")
public class RoleAssignments {
  @JsonProperty("_ref")
  private String ref = null;

  @JsonProperty("_refProperties")
  private ManagedAssignmentsItemsRefProperties refProperties = null;

  public RoleAssignments ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * References a relationship from a managed object
   * @return ref
  **/
  @ApiModelProperty(value = "References a relationship from a managed object")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public RoleAssignments refProperties(ManagedAssignmentsItemsRefProperties refProperties) {
    this.refProperties = refProperties;
    return this;
  }

   /**
   * Get refProperties
   * @return refProperties
  **/
  @ApiModelProperty(value = "")
  public ManagedAssignmentsItemsRefProperties getRefProperties() {
    return refProperties;
  }

  public void setRefProperties(ManagedAssignmentsItemsRefProperties refProperties) {
    this.refProperties = refProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssignments roleAssignments = (RoleAssignments) o;
    return Objects.equals(this.ref, roleAssignments.ref) &&
        Objects.equals(this.refProperties, roleAssignments.refProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, refProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssignments {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    refProperties: ").append(toIndentedString(refProperties)).append("\n");
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

