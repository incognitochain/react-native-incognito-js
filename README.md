# react-native-incognito-js

## Getting started

### Install node core modules

`$ yarn add -D rn-nodeify@latest`

Then, add this line to your app `package.json` script:

`"postinstall": "rn-nodeify --install crypto,stream,vm --yarn --hack"`

```
  "scripts": {
    "postinstall": "rn-nodeify --install crypto,stream --yarn --hack",
    "android": "react-native run-android",
    "ios": "react-native run-ios",
    ...
  },
```

### Install IncognitoJS module

`$ yarn add https://github.com/incognitochain/react-native-incognito-js`

This module needs `react-native-randombytes` to work, install it:

`$ yarn add react-native-randombytes`


##### Note for iOS

You need to add `Gomobile.framework` to your project xcworkspace. The framework is located in `node_modules/react-native-incognito-js/ios/Gomobile.framework`



### Mostly automatic installation

`$ react-native link react-native-incognito-js`

## Usage
```javascript
import incognitoJs from 'react-native-incognito-js';

incognitoJs;
```

See [IncognitoJS API Document](https://github.com/incognitochain/sdk-v2/#api)

See [an example (Incognito Wallet Template)](https://github.com/incognitochain/incognito-wallet-template)
