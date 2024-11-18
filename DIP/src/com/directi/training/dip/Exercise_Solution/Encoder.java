package com.directi.training.dip.exercise;

import java.util.Base64;

public class Encoder implements IEncoder {
    @Override
    public String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}