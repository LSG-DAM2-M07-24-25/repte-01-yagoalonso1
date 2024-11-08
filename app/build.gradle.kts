plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.androidstudio_koala_template"
    compileSdk = 35  // Asegúrate de tener la misma versión para compileSdk y targetSdk

    defaultConfig {
        applicationId = "com.example.androidstudio_koala_template"
        minSdk = 30
        targetSdk = 35  // Igual al compileSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"  // Asegúrate de tener la versión correcta de Compose
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // Dependencias principales de Compose
    implementation("androidx.compose.ui:ui:1.5.1")  // Reemplaza con la versión más reciente
    implementation("androidx.compose.material3:material3:1.0.0")  // Material3 para Compose
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.1")  // Para la vista previa en Android Studio
    implementation("androidx.compose.material:material-icons-extended:1.5.1")  // Si usas íconos extendidos
    implementation("androidx.activity:activity-compose:1.6.1")  // Necesario para el compose activity
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.0")  // Para lifecycle-aware components

    // Dependencias comunes
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Debugging
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}