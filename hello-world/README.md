# hello-world app

Based on the tutorial at: 

<https://github.com/clojure/clojurescript-site/blob/15ff26164b764c4a01e0fbd71713b9759d3dd020/content/guides/quick-start.adoc>

Instructions on windows

Run with

    java -cp "cljs.jar;src" cljs.main --compile hello-world.core --repl

or with a build script build.clj

    java -cp "cljs.jar;src" clojure.main build.clj

Ask for help

    java -cp "cljs.jar;src" cljs.main --help

Use on a web page

    include an index.html
    
''' html
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
    <script type="text/javascript" src="out/goog/base.js"></script>
    <script type="text/javascript" src="out/main.js"></script>
    <script type="text/javascript">
      goog.require("hello_world.core");
      // Note the underscore "_"!
    </script>
  </body>
</html>
'''
    
Production build

    java -cp "cljs.jar;src" cljs.main --optimizations advanced -c hello-world.core

Run as a server (headless)

    java -cp "cljs.jar;src" cljs.main --serve

