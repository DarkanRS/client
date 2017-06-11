@echo off
"C:\Program Files\Java\jre7\bin\javaw.exe" -Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -cp bin;./clientlibs.jar; Loader
exit