package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.DomApi
import com.raquo.laminar.api.L.{*, given}
import components.*

def App =
  div(
    cls := "max-w-full p-6 bg-white border border-gray-200 shadow dark:bg-gray-800 dark:border-gray-700",
    child.text <-- FetchStream
      .get("text/juan/1"),
//      .map(_.responseText)
    /*.map(html => foreignHtmlElement(DomApi.unsafeParseHtmlString(html)))*/
  )

//  Card(content)
