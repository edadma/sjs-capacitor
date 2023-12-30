package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.api.L.{*, given}

import typings.capacitorGeolocation.distEsmDefinitionsMod.PositionOptions
import typings.capacitorGeolocation.mod.Geolocation

import typings.capacitorCore.mod.Capacitor.^.convertFileSrc

import typings.capacitorCore.mod.WebView.getServerBasePath

import typings.capacitorCore.mod.CapacitorHttp

import org.scalajs.dom
import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js
import js.Thenable.Implicits._
import js.JSConverters._

def App =
  div(
    h1("Hello world!"),
    child <-- EventStream
      .fromJsPromise(Geolocation.getCurrentPosition(PositionOptions().setEnableHighAccuracy(true)))
      .map { position =>
        s"Your position: ${position.coords.latitude}, ${position.coords.longitude}"
      },
//    br(),
//    div(
//      convertFileSrc("/index.html"),
//    ),
//    div(
//      child <-- EventStream.fromJsPromise(getServerBasePath()).map(_.path),
//    ),
//    child.text <-- EventStream.fromJsPromise(
//      (for {
//        response <- dom.fetch(convertFileSrc("/index.html"))
//        text <- response.text()
//      } yield {
//        text
//      }).toJSPromise,
//    ),
//    child.text <-- EventStream
//      .fromJsPromise(
//        CapacitorHttp.get(
//          js.Dynamic
//            .literal(url = convertFileSrc("./index.html"))
//            .asInstanceOf[typings.capacitorCore.typesCorePluginsMod.HttpOptions],
//        ),
//      )
//      .map(response => response.data.asInstanceOf[String]),
  )
