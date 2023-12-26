package io.guthub.edadma.sjs_capacitor

import com.raquo.laminar.api.L.*

def App =
  div(
    className := "text-3xl",
    p(className := "font-serif", "serif"),
    p(className := "font-sans", "sans"),
    p(className := "font-fondamento", "fondamento normal"),
    p(className := "font-fondamento italic", "fondamento italic"),
    p(className := "font-gentium italic", "gentium italic"),
    p(className := "font-gentium font-bold", "gentium bold"),
    p(
      className := "font-gentium font-bold italic",
      "gentium bold italic",
    ),
    "gentium normal (default)",
  )
