#include <jni.h>
    

#include "opencv2/opencv.hpp"
#include "opencv2/imgproc/imgproc.hpp"
#include "opencv2/highgui/highgui.hpp"

using namespace cv;


extern "C"
JNIEXPORT void JNICALL
Java_com_opcv_activities_OpenCVModule_processFrame(
        JNIEnv *env,
        jobject /* this */,
        jlong matAddrGray) {
    Mat* frame=((Mat*)matAddrGray);

    putText(*frame, "This text was written in native code (C++).", cvPoint(30,30), 
    FONT_HERSHEY_COMPLEX_SMALL, 0.8, cvScalar(255,0,0), 1, CV_AA);
}


