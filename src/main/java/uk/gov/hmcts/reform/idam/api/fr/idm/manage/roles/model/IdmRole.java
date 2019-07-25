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
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleAssignments;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleAuthzMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.TemporalConstraintsItems;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-25T09:34:35.634+01:00")
public class IdmRole {
  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("members")
  private List<IdmRoleMembers> members = null;

  @JsonProperty("authzMembers")
  private List<IdmRoleAuthzMembers> authzMembers = null;

  @JsonProperty("assignments")
  private List<IdmRoleAssignments> assignments = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("assignableRoles")
  private List<String> assignableRoles = null;

  @JsonProperty("conflictingRoles")
  private List<String> conflictingRoles = null;

  @JsonProperty("temporalConstraints")
  private List<TemporalConstraintsItems> temporalConstraints = null;

  public IdmRole id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Role ID
   * @return id
   **/
  @ApiModelProperty(value = "Role ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IdmRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The role name, used for display purposes.
   * @return name
   **/
  @ApiModelProperty(required = true, value = "The role name, used for display purposes.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IdmRole description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The role description, used for display purposes.
   * @return description
   **/
  @ApiModelProperty(value = "The role description, used for display purposes.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IdmRole members(List<IdmRoleMembers> members) {
    this.members = members;
    return this;
  }

  public IdmRole addMembersItem(IdmRoleMembers membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Role Members
   * @return members
   **/
  @ApiModelProperty(value = "Role Members")
  public List<IdmRoleMembers> getMembers() {
    return members;
  }

  public void setMembers(List<IdmRoleMembers> members) {
    this.members = members;
  }

  public IdmRole authzMembers(List<IdmRoleAuthzMembers> authzMembers) {
    this.authzMembers = authzMembers;
    return this;
  }

  public IdmRole addAuthzMembersItem(IdmRoleAuthzMembers authzMembersItem) {
    if (this.authzMembers == null) {
      this.authzMembers = new ArrayList<>();
    }
    this.authzMembers.add(authzMembersItem);
    return this;
  }

  /**
   * Authorization Role Members
   * @return authzMembers
   **/
  @ApiModelProperty(value = "Authorization Role Members")
  public List<IdmRoleAuthzMembers> getAuthzMembers() {
    return authzMembers;
  }

  public void setAuthzMembers(List<IdmRoleAuthzMembers> authzMembers) {
    this.authzMembers = authzMembers;
  }

  public IdmRole assignments(List<IdmRoleAssignments> assignments) {
    this.assignments = assignments;
    return this;
  }

  public IdmRole addAssignmentsItem(IdmRoleAssignments assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

  /**
   * Managed Assignments
   * @return assignments
   **/
  @ApiModelProperty(value = "Managed Assignments")
  public List<IdmRoleAssignments> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<IdmRoleAssignments> assignments) {
    this.assignments = assignments;
  }

  public IdmRole condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * A conditional filter for this role
   * @return condition
   **/
  @ApiModelProperty(value = "A conditional filter for this role")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public IdmRole assignableRoles(List<String> assignableRoles) {
    this.assignableRoles = assignableRoles;
    return this;
  }

  public IdmRole addAssignableRolesItem(String assignableRolesItem) {
    if (this.assignableRoles == null) {
      this.assignableRoles = new ArrayList<>();
    }
    this.assignableRoles.add(assignableRolesItem);
    return this;
  }

  /**
   * Roles this role is allowed to assign
   * @return assignableRoles
   **/
  @ApiModelProperty(value = "Roles this role is allowed to assign")
  public List<String> getAssignableRoles() {
    return assignableRoles;
  }

  public void setAssignableRoles(List<String> assignableRoles) {
    this.assignableRoles = assignableRoles;
  }

  public IdmRole conflictingRoles(List<String> conflictingRoles) {
    this.conflictingRoles = conflictingRoles;
    return this;
  }

  public IdmRole addConflictingRolesItem(String conflictingRolesItem) {
    if (this.conflictingRoles == null) {
      this.conflictingRoles = new ArrayList<>();
    }
    this.conflictingRoles.add(conflictingRolesItem);
    return this;
  }

  /**
   * Roles that conflict with this role
   * @return conflictingRoles
   **/
  @ApiModelProperty(value = "Roles that conflict with this role")
  public List<String> getConflictingRoles() {
    return conflictingRoles;
  }

  public void setConflictingRoles(List<String> conflictingRoles) {
    this.conflictingRoles = conflictingRoles;
  }

  public IdmRole temporalConstraints(List<TemporalConstraintsItems> temporalConstraints) {
    this.temporalConstraints = temporalConstraints;
    return this;
  }

  public IdmRole addTemporalConstraintsItem(TemporalConstraintsItems temporalConstraintsItem) {
    if (this.temporalConstraints == null) {
      this.temporalConstraints = new ArrayList<>();
    }
    this.temporalConstraints.add(temporalConstraintsItem);
    return this;
  }

  /**
   * An array of temporal constraints for a role
   * @return temporalConstraints
   **/
  @ApiModelProperty(value = "An array of temporal constraints for a role")
  public List<TemporalConstraintsItems> getTemporalConstraints() {
    return temporalConstraints;
  }

  public void setTemporalConstraints(List<TemporalConstraintsItems> temporalConstraints) {
    this.temporalConstraints = temporalConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdmRole idmRole = (IdmRole) o;
    return Objects.equals(this.id, idmRole.id) &&
            Objects.equals(this.name, idmRole.name) &&
            Objects.equals(this.description, idmRole.description) &&
            Objects.equals(this.members, idmRole.members) &&
            Objects.equals(this.authzMembers, idmRole.authzMembers) &&
            Objects.equals(this.assignments, idmRole.assignments) &&
            Objects.equals(this.condition, idmRole.condition) &&
            Objects.equals(this.assignableRoles, idmRole.assignableRoles) &&
            Objects.equals(this.conflictingRoles, idmRole.conflictingRoles) &&
            Objects.equals(this.temporalConstraints, idmRole.temporalConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, members, authzMembers, assignments, condition, assignableRoles, conflictingRoles, temporalConstraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdmRole {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    authzMembers: ").append(toIndentedString(authzMembers)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    assignableRoles: ").append(toIndentedString(assignableRoles)).append("\n");
    sb.append("    conflictingRoles: ").append(toIndentedString(conflictingRoles)).append("\n");
    sb.append("    temporalConstraints: ").append(toIndentedString(temporalConstraints)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}