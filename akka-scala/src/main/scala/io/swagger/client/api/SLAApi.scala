/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.App
import io.swagger.client.model.SLAApp
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object SLAApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : App (OK)
   * 
   * @param sapp sapp
   */
  def createUsingPOST2(sapp: SLAApp): ApiRequest[App] =
    ApiRequest[App](ApiMethods.POST, "https://auth.sinocloudlab.com", "/api/sla/create", "application/json;charset=UTF-8")
      .withBody(sapp)
      .withSuccessResponse[App](200)
      

}

