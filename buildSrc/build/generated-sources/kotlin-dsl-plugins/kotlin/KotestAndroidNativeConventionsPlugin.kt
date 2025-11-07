/**
 * Precompiled [kotest-android-native-conventions.gradle.kts][Kotest_android_native_conventions_gradle] script plugin.
 *
 * @see Kotest_android_native_conventions_gradle
 */
public
class KotestAndroidNativeConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Kotest_android_native_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
