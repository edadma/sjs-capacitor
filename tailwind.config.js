/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./target/scala-3.3.1/sjs-capacitor-fastopt/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [
    require('@tailwindcss/typography'),
    require('@tailwindcss/forms')
  ],
}
