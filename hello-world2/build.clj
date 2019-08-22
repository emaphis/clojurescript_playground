(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'hello-world2.core
                       :output-to "out/main.js"})
