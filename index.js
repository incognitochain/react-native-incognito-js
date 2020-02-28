import { NativeModules } from 'react-native';
import * as incognitoJsSDK from 'incognito-js';
import { randomBytes } from 'react-native-randombytes';

const { IncognitoJs: PrivacyGo } = NativeModules;

const log = (...args) => console.log('GOMODULE', ...args);

const implementedMethods = {};

try {
  incognitoJsSDK.goServices.GO_METHOD_NAMES.forEach(methodName => {
    implementedMethods[methodName] = (data) => {
      return new Promise((resolve, reject) => {
        try {
          log(`${methodName} called with params`, data);
          PrivacyGo[methodName](data, function(error, result) {
            if (error) {
              reject(error);
            }

            log(`${methodName} called successfully with result`, result);
            return resolve(result);
          });
        } catch (e) {
          log(`${methodName} called with error`, e);
          reject(e);
        }
      });
    };
  });

  console.log('GO modules were loaded');
} catch {
  console.error('GO modules can not loaded');
}

incognitoJsSDK.goServices.implementGoMethodManually(implementedMethods);

incognitoJsSDK.walletServices.setPrivacyUtilRandomBytesFunc(randomBytes);

export default incognitoJsSDK;
