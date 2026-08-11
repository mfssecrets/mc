# mc
A creator app

## Android SDK Setup

This project requires the Android SDK to build and run the app.

### Install the Android SDK

1. Download the official Android Studio or SDK command-line tools from:
   https://developer.android.com/tools

2. If you only want the command-line tools, install the Android SDK Command-line Tools package.

3. After installation, configure the SDK path in `local.properties`:

   ```properties
   sdk.dir=/opt/android-sdk
   ```

   Or set the environment variable:

   ```bash
   export ANDROID_HOME=/opt/android-sdk
   export PATH="$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$PATH"
   ```

4. Install required SDK packages:

   ```bash
   sdkmanager "platform-tools" "platforms;android-33" "build-tools;34.0.0"
   ```

5. Build the app:

   ```bash
   ./gradlew assembleDebug
   ```

### Notes

- If Android Studio is installed, use the SDK Manager inside the IDE to install `Android SDK Platform 33`, `Android SDK Build-Tools`, and `Android SDK Platform-Tools`.
- Keep `sdk.dir` or `ANDROID_HOME` pointed to your Android SDK installation.
