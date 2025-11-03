# SampleAndroidApp

This repository contains a minimal Android application written in Kotlin. The example showcases:

- Gradle Kotlin DSL configuration with Android application and Kotlin plugins.
- A single `MainActivity` that uses ViewBinding to interact with the UI.
- A simple layout that changes the greeting text when the button is tapped.
- An Espresso instrumentation test that verifies the interaction flow.

## Project structure

```
SampleAndroidApp/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── app/
    ├── build.gradle.kts
    ├── proguard-rules.pro
    └── src/
        └── main/
            ├── AndroidManifest.xml
            ├── java/com/example/sampleapp/MainActivity.kt
            └── res/
                ├── layout/activity_main.xml
                └── values/
                    ├── colors.xml
                    ├── strings.xml
                    └── themes.xml
```

To open and run the project, import it into Android Studio (Giraffe or newer) and use the standard **Run** command to launch the `app` configuration on an emulator or physical device.

## Tests

The UI behaviour is covered by an instrumentation test located at
`app/src/androidTest/java/com/example/sampleapp/MainActivityTest.kt`. Execute it from
Android Studio or via `./gradlew connectedAndroidTest` while an emulator or device is
attached.

## Version history

- Initial project setup with a ViewBinding-driven greeting screen and supporting
  Gradle configuration.
- Added an Espresso instrumentation test and updated documentation describing how to
  run it.
