@echo off
chcp 65001 >nul
"C:\Program Files\Java\jdk-21.0.10\bin\java.exe" ^
  -Dfile.encoding=UTF-8 ^
  -jar "C:\Users\Chaser\Desktop\StartJava\utils\checkstyle-13.1.0-all.jar" ^
  -c "C:\Users\Chaser\Desktop\StartJava\startjava_checks.xml" ^
  %*
