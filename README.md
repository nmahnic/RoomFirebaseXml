1) Create Project and commit 
2) Run project, it's failed -> fix sdk version
3) Create :data module and remove AndroidManifest.xml from it
4) Create :domain module, its don't depend from android framework
5) Create :presentation module 
6) Remote from :data module "androidTest" folder
7) Create RoomFirebaseXmlApp.kt file next to MainActivity.kt file, RoomFirebaseXmlApp extends from Application
8) Add android:name in AndroidManifest.xml
9) Add koin dependency in app module