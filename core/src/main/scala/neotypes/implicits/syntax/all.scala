package neotypes
package implicits.syntax

private[neotypes] abstract class AllSyntax
  //extends AsyncSyntax
  extends CypherSyntax
  with DriverSyntax
  with QueryParamSyntax
  with SessionSyntax
  with StringSyntax
