object Versions{
    const val gradle = "4.1.1"
    const val kotlin_stdlib = "1.3.72"
    const val core_ktx = "1.3.1"
    const val appcompat = "1.2.0"
    const val material = "1.2.1"
    const val constraintlayout = "2.0.1"
    const val junit = "4.13.2"
    const val ext_junit = "1.1.2"
    const val espresso_core = "3.3.0"

    const val lifecycle = "2.2.0"

    const val okhttp = "3.14.9"
    const val retrofit2 = "2.9.0"
    const val gson = "2.9.0"
    const val rxJava = "2.9.0"
    const val rxAndroid = "3.0.0"
}


object Libs{
    //根项目gradle配置 classpath
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_stdlib}"
    val gradle = "com.android.tools.build:gradle:${Versions.gradle}"


    //系统库
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_stdlib}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val material = "com.google.android.material:material:${Versions.material}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val junit = "junit:junit:${Versions.junit}"
    val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"

    //lifecycle
    val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle}"

    //network
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
    val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    val rxJava = "com.squareup.retrofit2:adapter-rxjava3:${Versions.rxJava}"
    val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid}"

}