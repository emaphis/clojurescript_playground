(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'hello-world2.core
                       :output-to "out/main.js"})
