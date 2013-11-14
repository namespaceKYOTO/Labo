echo off
setlocal

rem set local environment path
set JAVAC_PATH=C:\"Program Files"\Java\jdk1.7.0_40\bin
set JAVA_PATH=C:\"Program Files"\Java\jdk1.7.0_40\bin


cd .\bat
cmd /K type launch_mem.txt

endlocal
