package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.api.L.{*, given}

import typings.capacitorGeolocation.distEsmDefinitionsMod.PositionOptions
import typings.capacitorGeolocation.mod.Geolocation

def App =
  div(
    h1("Hello world!"),
    child <-- EventStream
      .fromJsPromise(Geolocation.getCurrentPosition(PositionOptions().setEnableHighAccuracy(true)))
      .map { position =>
        s"Your position: ${position.coords.latitude}, ${position.coords.longitude}"
      },
  )
