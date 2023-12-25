package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.api.L.*

def App =
  div(
    className := "text-4xl",
    p(className := "font-serif", "The quick brown fox jumps over the lazy dog. "),
    p(className := "font-sans", "The quick brown fox jumps over the lazy dog. "),
    p(className := "font-quintessential", "The quick brown fox jumps over the lazy dog. "),
    "The quick brown fox jumps over the lazy dog.",
  )
