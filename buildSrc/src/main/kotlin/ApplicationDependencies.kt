object ApplicationDependencies {

    private const val core = "androidx.core:core-ktx:${ApplicationDependencyVersions.core}"
    private const val activity = "androidx.activity:activity-compose:${ApplicationDependencyVersions.activity}"
    private const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${ApplicationDependencyVersions.lifecycle}"
    private const val kotlinStandardLib = "org.jetbrains.kotlin:kotlin-stdlib:${ApplicationDependencyVersions.kotlin}"
    private const val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${ApplicationDependencyVersions.kotlinCoroutinesCore}"
    private const val composeUI = "androidx.compose.ui:ui:${ApplicationDependencyVersions.compose}"
    private const val composeMaterial = "androidx.compose.material:material:${ApplicationDependencyVersions.compose}"
    private const val composeUIToolingPreview = "androidx.compose.ui:ui-tooling-preview:${ApplicationDependencyVersions.compose}"
    private const val svgPathCompose = "com.github.slaviboy:SVGPathCompose:${ApplicationDependencyVersions.svgPathCompose}"

    // testing
    const val junit = "junit:junit:${ApplicationDependencyVersions.junit}"

    val dependenciesApp = arrayListOf(
        kotlinStandardLib,
        kotlinxCoroutinesCore,
        composeUI,
        composeMaterial,
        composeUIToolingPreview,
        core,
        activity,
        lifecycle
    )

    val dependenciesLibrary = arrayListOf(
        kotlinStandardLib,
        kotlinxCoroutinesCore,
        composeUI,
        composeMaterial,
        composeUIToolingPreview,
        svgPathCompose
    )
}