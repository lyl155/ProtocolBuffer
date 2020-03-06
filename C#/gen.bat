REM description :   generate the .cs files from .proto files
REM author      :   Jave.Lin
REM date        :   2018-03-13

@echo off
setlocal enabledelayedexpansion

REM cs file out put path
set cs_out_path=%~1
if "%cs_out_path%"=="" (
    set cs_out_path=cs\
    )

if "%%cs_out_path:~0,-1%%"==%cs_out_path:~-1%  else (set cs_out_path=!cs_out_path!\)

REM protoc file
set protoc_file=protoc.exe

REM protogen file
set protogen_file=protogen.exe

REM proto files
REM set proto_files=ProtoJaveTestData.proto,ProtoMyData.proto
set proto_files=*.proto

echo Generating...

for /R %%s in (!proto_files!) do ( 
    set fileName=%%s

    echo handling file : !fileName!

    set csFileName=!fileName:~0,-6!.cs
    set protobinFileName=!fileName:~0,-6!.protobin

    set outputProtobinFileName=!protobinFileName:%~dp0=!
    !protoc_file! -I=%~dp0 --descriptor_set_out=!protobinFileName:%~dp0=! --include_imports !fileName!
    !protogen_file! !protobinFileName!
)

echo Generation complete!

echo moving cs file...

RD /s /q !cs_out_path!
MD !cs_out_path!

for %%s in (*.cs) do (
    set moveToFileName=!cs_out_path!%%s
    move %%s !moveToFileName!
)

echo moving cs file complete!

pause
--------------------- 
作者：linjf520 
来源：CSDN 
原文：https://blog.csdn.net/linjf520/article/details/79554490 
版权声明：本文为博主原创文章，转载请附上博文链接！