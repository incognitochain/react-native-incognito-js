# react-native-incognito-js

## Getting started

### Install node core modules

`$ npm install rn-nodeify@latest --save-dev`

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

`$ npm install react-native-incognito-js --save`

This module needs `react-native-randombytes` to work, install it:

`$ npm install react-native-randombytes --save`



### Mostly automatic installation

`$ react-native link react-native-incognito-js`

## Usage
```javascript
import IncognitoJs from 'react-native-incognito-js';

IncognitoJs;
```
