echo off
setlocal

rem set local environment path
set JAVAC_PATH=
set JAVA_PATH=

rem set Root path
set ROOT_PATH=%CD%

rem launch
cd .\bat
cmd /K type launch_mem.txt

endlocal
