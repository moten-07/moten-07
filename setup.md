### update gradle version

`gradle wrapper --gradle-version=8.14.1 --distribution-type=all`

### clean

`gradle clean build`

* `/app`is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - `commonMain` is for code that’s common for all targets.
    - `androidMain`
        + install: `gradle -q :app:android:installDebug`
    - `desktopMain`
        + run: `gradle -q :app:run -DmainClass=Main_desktopKt`
    - `wasmJsMain`
        + run:`gradle :app:wasmJsBrowserDevelopmentRun`
        + Generate artifacts: `gradle :app:wasmJsBrowserDistribution`
            * The generated artifacts are in the directory: `app/build/dist/wasmJs/productionExecutable`
            * can push it to GitHub pages
* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.
* `/server` is for the Ktor server application.
* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here
  too.