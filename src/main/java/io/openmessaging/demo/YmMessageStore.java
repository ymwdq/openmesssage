package io.openmessaging.demo;

import io.openmessaging.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YangMing on 2017/5/3.
 */
public class YmMessageStore {

    private static final YmMessageStore storer = new YmMessageStore();

    public static YmMessageStore getInstance() {
        return storer;
    }

    public synchronized void addMessage(Message msg, int bodyLength) {

    }
}
