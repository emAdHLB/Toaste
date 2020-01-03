# Toaste - Android

[![Developer](https://img.shields.io/badge/Developer-eHLB-%23117243?style=for-the-badge)](https://github.com/Nightonke)
[![Platform](https://img.shields.io/badge/Platform-Android-%117243?style=for-the-badge)](https://www.android.com)
[![SDK](https://img.shields.io/badge/SKD-17+-%231771F1?style=for-the-badge)](https://www.android.com)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

The usual Toast with simple animation

## Preview & Usage [![Hits-of-Code](https://hitsofcode.com/github/emAdHLB/Toaste)](https://hitsofcode.com/view/github/emAdHLB/Toaste)


-  Info Toaste

Kotlin

```kotlin
        Toaste.makeInfo(context, "Info Toaste").show()
```

Java

```Java
        Toaste.Companion.makeInfo(context, "Info Toaste", true, Toast.LENGTH_LONG).show();
```

<img src="https://github.com/emAdHLB/Toaste/blob/master/images/InfoToaste.gif" width="400">

-  Success Toaste

```kotlin
        Toaste.makeSuccess(context, "Success Toaste", false).show()
```

<img src="https://github.com/emAdHLB/Toaste/blob/master/images/SuccessToaste.gif" width="400">

-  Warning Toaste

```kotlin
        Toaste.makeWarning(context, "Warning Toaste").show()
```

<img src="https://github.com/emAdHLB/Toaste/blob/master/images/WarningToaste.gif" width="400">

-  Error Toaste

```kotlin
        Toaste.makeError(context, "Error Toaste", false).show()
```

<img src="https://github.com/emAdHLB/Toaste/blob/master/images/ErrorToaste.gif" width="400">

-  Custom Toaste

```kotlin
            Toaste.makeCustom(
                context,
                "Custom Toaste",
                true, //animation
                Toaste.LENGTH_SHORT,
                R.drawable.ic_flight_24dp,  //icon
                R.color.a,  //bg gradient start color
                R.color.b,  //bg gradient end color
                10f,  //corner radius
                R.color.holo_green_light, //textColor
                R.color.white,  //icon tint
                Gravity.TOP //toast position
            ).show()
```

<img src="https://github.com/emAdHLB/Toaste/blob/master/images/CustomToaste.gif" width="400">

## Download
[![](https://jitpack.io/v/emAdHLB/Toaste.svg)](https://jitpack.io/#emAdHLB/Toaste)

-  Gradle

Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency

```gradle

dependencies {
	        implementation 'com.github.emAdHLB:Toaste:0.1.0'
	}
```

#### or

- Maven

 Step 1. Add the JitPack repository to your build file 
 
 ```maven
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
Step 2. Add the dependency

  ```maven
	<dependency>
	    <groupId>com.github.emAdHLB</groupId>
	    <artifactId>Toaste</artifactId>
	    <version>0.1.0</version>
	</dependency>
```

## Author

Emad Alhalabi: [@emAd_HLB](https://twitter.com/emAd_HLB)

Let me know what you think: [ehlb.dev@gmail.com](mailto:ehlb.dev@gmail.com)

Contributions are welcome!

## License

<pre>
Copyright (c) 2019 Emad Alhalabi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
</pre>
