package io.guthub.edadma.sjs_capacitor.components

import com.raquo.laminar.api.L.{*, given}

def Card(content: Node*) =
  div(
    cls := "max-w-sm p-6 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700",
    content,
  )
