package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

@main def run(): Unit = render(dom.document.getElementById("root"), App)
