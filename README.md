# React Native UUID

`react-native-uuids` is a simple library to create Native [RFC-4122](http://www.ietf.org/rfc/rfc4122.txt) V4 UUIDs.
The package is both **Android** and **iOS** compatible.

## Getting started

```bash
yarn add react-native-uuids
# or with npm
npm install react-native-uuids
```

### Mostly automatic installation

For React-Native >= 0.60 this module will be linked automatically.

`cd ios && pod install`

Before 0.60 `react-native-uuids` can be manually linked.

`react-native link react-native-uuids`

## Usage

```javascript
import React, {useState} from 'react';
import {Text} from 'react-native';
import UUID from 'react-native-uuids';

const Home: () => React$Node = () => {
  const [uuid, setUuid] = useState(null);

  if (!uuid) {
    UUID.create((error, createdUuid) => {
      if (error) {
        console.error(error);
      } else {
        setUuid(createdUuid);
      }
    });
  }
  return <Text>{uuid}</Text>;
};

export default Home;
```
