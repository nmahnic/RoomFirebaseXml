1) Create Project and commit 
2) Run project, it's failed -> fix sdk version
3) Create :data module. Module type is "java or kotlin library", it don't depend on Android Framework
4) Create :domain module. Module type is "java or kotlin library", it don't depend on Android Framework
5) Create :presentation module. Module type is "Android library"
6) Create RoomFirebaseXmlApp.kt file next to MainActivity.kt file, RoomFirebaseXmlApp extends from Application
7) Add android:name in AndroidManifest.xml
8) Add koin dependency in app and presentation modules (implementation "io.insert-koin:koin-android:3.5.0")
9) Add koin dependency in domain module (api "io.insert-koin:koin-core:3.5.0")
10) Create :data:feature_users submodule. Module type is "Android library", it depends on Android Framework
11) Add koin dependency in feature_users module (api "io.insert-koin:koin-core:3.5.0")
