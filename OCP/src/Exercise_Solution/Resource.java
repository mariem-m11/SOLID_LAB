package com.directi.training.ocp.exercise;

public interface Resource {
    int isFree();
    void markBusy(int resourceId);
    void markFree(int resourceId);
}