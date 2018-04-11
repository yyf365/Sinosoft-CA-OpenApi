/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class PageOfApp (
  content: Option[Seq[App]],
  first: Option[Boolean],
  last: Option[Boolean],
  number: Option[Int],
  numberOfElements: Option[Int],
  size: Option[Int],
  sort: Option[Sort],
  totalElements: Option[Long],
  totalPages: Option[Int]
) extends ApiModel


