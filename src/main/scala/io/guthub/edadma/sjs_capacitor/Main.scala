package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.api.L._
import org.scalajs.dom

//import typings.capacitorGeolocation.distEsmDefinitionsMod.PositionOptions
//import typings.capacitorGeolocation.mod.Geolocation

@main def run(): Unit =
  val app =
    div(
      h1(className := "text-5xl font-extrabold", "Hello world!"),
      p("This is the paragraph text."),
    )

  render(dom.document.getElementById("root"), app)
