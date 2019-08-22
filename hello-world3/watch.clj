(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'hello-world3.core
                       :output-to "out/main.js"})
