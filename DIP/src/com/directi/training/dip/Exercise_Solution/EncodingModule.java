package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModule {
    private IDataReader dataReader;
    private IDataWriter dataWriter;
    private IEncoder encoder;

    public EncodingModule(IDataReader reader, IDataWriter writer, IEncoder encoder) {
        this.dataReader = reader;
        this.dataWriter = writer;
        this.encoder = encoder;
    }

    public void encodeData() throws IOException {
        String readData = dataReader.read();
        String encodedData = encoder.encode(readData);
        dataWriter.write(encodedData);
    }
}
