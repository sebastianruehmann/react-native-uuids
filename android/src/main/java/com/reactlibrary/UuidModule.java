package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.UUID;

public class UuidModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public UuidModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Uuid";
    }

    @ReactMethod
    public void create(Callback callback) {
        UUID uuid = UUID.randomUUID();
        String nsUUID = uuid.toString();

        callback.invoke(null, nsUUID);
    }
}
