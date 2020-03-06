REM description :   generate the .java files from .proto files
REM author      :   Jave.Lin
REM date        :   2018-03-13

@echo off
setlocal enabledelayedexpansion
REM java file out put path
set java_out_path=%~1
if "%java_out_path%"=="" (
    set java_out_path=java\
    )

if "%%java_out_path:~0,-1%%"==%java_out_path:~-1%  else (set java_out_path=!java_out_path!\)

REM protoc file
set protoc_file=protoc.exe

REM proto files
REM set proto_files=ProtoJaveTestData.proto,ProtoMyData.proto
set proto_files=*.proto

echo Generating...

for /R %%s in (!proto_files!) do ( 
    set fileName=%%s

    echo handling file : !fileName!

    set javaFileName=!fileName:~0,-6!.java
    set protobinFileName=!fileName:~0,-6!.protobin

    set outputProtobinFileName=!protobinFileName:%~dp0=!
    !protoc_file! -I=%~dp0 --descriptor_set_out=!protobinFileName:%~dp0=! --include_imports !fileName! --java_out=./

)

echo Generation complete!
RD /s /q !java_out_path!
MD !java_out_path!
for %%s in (*.java) do (
    set moveToFileName=!java_out_path!%%s
    move %%s !moveToFileName!
)

echo moving java file complete!

pause
--------------------- 
作者：linjf520 
来源：CSDN 
原文：https://blog.csdn.net/linjf520/article/details/79554490 
版权声明：本文为博主原创文章，转载请附上博文链接！