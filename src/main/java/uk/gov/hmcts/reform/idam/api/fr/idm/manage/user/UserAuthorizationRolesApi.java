package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserAuthzRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserAuthzRolesQueryResult;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface UserAuthorizationRolesApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param userId
   * @param authzRolesId
   * @param requestPayload
   * @param cookie
   * @return UserAuthzRoles
   */
  default UserAuthzRoles putCreate(String userId, String authzRolesId, UserAuthzRoles requestPayload, String cookie) {
    return putIfRevision(userId, authzRolesId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param userId
   * @param authzRolesId
   * @param requestPayload
   * @param cookie
   * @return UserAuthzRoles
   */
  default UserAuthzRoles putUpdate(String userId, String authzRolesId, UserAuthzRoles requestPayload, String cookie) {
    return putIfRevision(userId, authzRolesId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param userId
   * @param authzRolesId
   * @param patchArray
   * @param cookie
   * @return UserAuthzRoles
   */
  default UserAuthzRoles patch(String userId, String authzRolesId, PatchArray patchArray, String cookie) {
    return patchIfMatch(userId, authzRolesId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param userId
   * @param authzRolesId
   * @param cookie
   * @return UserAuthzRoles
   */
  default UserAuthzRoles delete(String userId, String authzRolesId, String cookie) {
    return deleteIfMatch(userId, authzRolesId, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserAuthzRoles
   */
  @RequestLine("DELETE /managed/user/{userId}/authzRoles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  UserAuthzRoles deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserAuthzRoles
   */
  @RequestLine("GET /managed/user/{userId}/authzRoles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserAuthzRoles get(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserAuthzRoles
   */
  @RequestLine("PATCH /managed/user/{userId}/authzRoles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  UserAuthzRoles patchIfMatch(@Param("userId") String userId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param userId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserAuthzRoles
   */
  @RequestLine("POST /managed/user/{userId}/authzRoles?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserAuthzRoles post(@Param("userId") String userId, UserAuthzRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

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
   * @return UserAuthzRoles
   */
  @RequestLine("PUT /managed/user/{userId}/authzRoles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  UserAuthzRoles putIfRevision(@Param("userId") String userId, @Param("id") String id, UserAuthzRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter
   * 
   * Note, this is equivalent to the other <code>queryFilter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryFilterParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>queryId -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return UserAuthzRolesQueryResult
   */
  @RequestLine("GET /managed/user/{userId}/authzRoles?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  UserAuthzRolesQueryResult queryFilter(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    public QueryFilterParams queryId(final String value) {
      put("_queryId", EncodingUtils.encode(value));
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
