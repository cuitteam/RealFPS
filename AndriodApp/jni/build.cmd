@echo off
cd /d %~dp0
ndk-build -B NDK_APPLICATION_MK=Application.mk
pause