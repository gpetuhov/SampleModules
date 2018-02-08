# SampleModules
Example of Android Studio project with multiple modules

Project consists of 4 modules:
1. MessageProvider

Java library module. Provides String message.

2. toaster

Android library module. Shows toast message.

3. mainactivitylibrary

Android library module. Contains MainActivity class which uses both MessageProvider and toaster modules in its onResume method to get String message and show toast with it.

4. app

Main application module. Uses mainactivitylibrary. app module does not have its own activity and uses MainActivity class directly from mainactiviylibrary in the manifest file.

Note: There are 2 string resource files with the same string id hello_world: in mainactivitylibrary and app modules. In app module MainActivity class uses hello_world from app's string resource file.
