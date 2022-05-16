# IconsCompose
Simple Jetpack Compose library for adding 1000+ icons to your composable written in Kotlin

<p align="center">
    <img src="https://github.com/slaviboy/RepositoryImages/blob/main/icons1.png" alt="Image"   />
</p>
 
## About
IconsCompose is simple library that with over 1000+ icons, that you can include in your library, you can select the icons from here.

[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![Download](https://img.shields.io/badge/version-0.0.1-blue)](https://github.com/slaviboy/SVGPathKotlin/releases/tag/v0.0.1)

## Add to your project
Add the jitpack maven repository to your *Project* build gradle file
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
``` 

Add the dependency to your *app* build gradle file
```
dependencies { 
  implementation 'com.github.slaviboy:IconsCompose:0.0.1'
}
```
 
### How to use
To add icons to your composable, simply add the [Icon](https://github.com/slaviboy/IconsCompose/blob/master/iconsCompose/src/main/java/com/slaviboy/iconscompose/Icon.kt) composable, where you can set the modifier and spesify your icon size
```kotlin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        
            // add Icon inside your composable
            Icon(
              modifier = Modifier
                  .width(15.dp)
                  .height(15.dp),
              iconType = IconType.HomeRR(),
              color = Color.Red
           )
        }
    }
}

```
 
_**To check the available example on creating custom Composable check the classes in the [composable](https://github.com/slaviboy/IconsCompose/tree/master/app/src/main/java/com/slaviboy/iconscomposeexample/composables) package.**_
 
