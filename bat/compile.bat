pushd %JAVAC_PATH%
javac -d %ROOT_PATH%\out -sourcepath %ROOT_PATH% @%ROOT_RELATIVE_PATH%\%1
popd
