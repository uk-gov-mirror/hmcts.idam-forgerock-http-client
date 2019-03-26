package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRolesQueryResult;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface UserProvisioningRolesApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param userId
   * @param rolesI
   * @param requestPayload
   * @param cookie
   * @return UserRoles
   */
  default UserRoles putCreate(String userId, String rolesI, UserRoles requestPayload, String cookie) {
    return putIfRevision(userId, rolesI, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param userId
   * @param rolesI
   * @param requestPayload
   * @param cookie
   * @return UserRoles
   */
  default UserRoles putUpdate(String userId, String rolesI, UserRoles requestPayload, String cookie) {
    return putIfRevision(userId, rolesI, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param userId
   * @param rolesI
   * @param patchArray
   * @param cookie
   * @return UserRoles
   */
  default UserRoles patch(String userId, String rolesI, PatchArray patchArray, String cookie) {
    return patchIfMatch(userId, rolesI, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param userId
   * @param rolesI
   * @param cookie
   * @return UserRoles
   */
  default UserRoles delete(String userId, String rolesI, String cookie) {
    return deleteIfMatch(userId, rolesI, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserRoles
   */
  @RequestLine("DELETE /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  UserRoles deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserRoles
   */
  @RequestLine("GET /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserRoles get(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserRoles
   */
  @RequestLine("PATCH /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  UserRoles patchIfMatch(@Param("userId") String userId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param userId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserRoles
   */
  @RequestLine("POST /managed/user/{userId}/roles?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserRoles post(@Param("userId") String userId, UserRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update or Create with Client-Assigned ID
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserRoles
   */
  @RequestLine("PUT /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-None-Match: {ifNoneMatch}",
    "If-Match: {ifMatch}"
  })
  UserRoles putIfRevision(@Param("userId") String userId, @Param("id") String id, UserRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter
   *
   * @param userId  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return UserRolesQueryResult
   */
  @RequestLine("GET /managed/user/{userId}/roles?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  UserRolesQueryResult queryFilter(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryFilter</code> method in a fluent style.
   */
  public static class QueryFilterParams extends HashMap<String, Object> {
    public QueryFilterParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams queryFilter(final String value) {
      put("_queryFilter", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams pageSize(final Integer value) {
      put("_pageSize", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams totalPagedResultsPolicy(final String value) {
      put("_totalPagedResultsPolicy", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams sortKeys(final String value) {
      put("_sortKeys", EncodingUtils.encode(value));
      return this;
    }
  }
}
