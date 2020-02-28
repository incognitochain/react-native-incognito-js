package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import gomobile.Gomobile;


public class IncognitoJsModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public IncognitoJsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "IncognitoJs";
    }

    @ReactMethod
    public void deriveSerialNumber(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.deriveSerialNumber(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void randomScalars(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.randomScalars(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initPrivacyTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initPrivacyTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initPrivacyTokenTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initPrivacyTokenTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initBurningRequestTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initBurningRequestTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initWithdrawRewardTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initWithdrawRewardTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void staking(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.staking(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initPRVContributionTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initPRVContributionTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initPTokenContributionTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initPTokenContributionTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initPRVTradeTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initPRVTradeTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void initPTokenTradeTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.initPTokenTradeTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void withdrawDexTx(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.withdrawDexTx(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void hybridDecryptionASM(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.hybridDecryptionASM(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void hybridEncryptionASM(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.hybridEncryptionASM(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void stopAutoStaking(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.stopAutoStaking(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void generateBLSKeyPairFromSeed(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.generateBLSKeyPairFromSeed(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void scalarMultBase(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.scalarMultBase(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }

    @ReactMethod
    public void generateKeyFromSeed(String data, Callback successCallback) {
        try {
            successCallback.invoke(null, Gomobile.generateKeyFromSeed(data));
        } catch (Exception e) {
            successCallback.invoke(e.getMessage(), null);
        }
    }
}
