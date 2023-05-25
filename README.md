# Loading-lib
Loading Animation Library

 ### Gradle
**Step 1** Add the JitPack repository to your build file. Add it in your build.gradle at the end of repositories.

```java
  repositories {
    maven { url "https://jitpack.io" }
  }
```

**Step-2** Add the dependency in the form

```java
dependencies {
    implementation 'com.github.iamauttamai:Loading-lib:1.0.4'
}
```

## Using

  -  In Kotlin
```kotlin
        AVLoading.loadingParamsBuilder(this,
            TypeIndicator.BallScaleMultipleIndicator, Color.parseColor("#FFFFFF"))
        AVLoading.initializeAVLoading()

        binding.btnStart.setOnClickListener {
            AVLoading.startAnimLoading()
        }

        binding.btnStop.setOnClickListener {
            AVLoading.stopAnimLoading()
        }
```
  

### Maven
```xml
<repository>
     <id>jitpack.io</id>
     <url>https://jitpack.io</url>
</repository>
```



