#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_whale_whale_1studio_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
