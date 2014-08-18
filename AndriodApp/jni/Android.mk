#module inject
LOCAL_PATH		:= $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE 	:= inject
LOCAL_LDLIBS    := -lm -llog
LOCAL_SRC_FILES := inject.c 
#shellcode.s
include $(BUILD_EXECUTABLE)

include $(CLEAR_VARS)

LOCAL_MODULE    := realfps
LOCAL_LDLIBS    := -llog -landroid -lEGL -lGLESv2
LOCAL_SRC_FILES := realfps.c

include $(BUILD_SHARED_LIBRARY)
