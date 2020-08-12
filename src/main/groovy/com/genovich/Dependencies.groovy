package com.genovich

class Dependencies {
    public static final String okhttp = "com.squareup.okhttp3:okhttp:$Versions.okhttp"
    public static final String gson = "com.google.code.gson:gson:$Versions.gson"

    static class retrofit {
        public static final String retrofit = "com.squareup.retrofit2:retrofit:$Versions.retrofit"
        public static final String converterGson = "com.squareup.retrofit2:converter-gson:$Versions.retrofit"
    }

    static class androidx {
        public static final String appcompat = "androidx.appcompat:appcompat:$Versions.appcompat"
        public static final String core = "androidx.core:core-ktx:$Versions.androidxCore"
        public static final String fragment = "androidx.fragment:fragment-ktx:$Versions.fragment"

        static class lifecycle {
            public static final String extensions = "androidx.lifecycle:lifecycle-extensions:$Versions.lifecycle"
            public static final String savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$Versions.lifecycleSavedState"
            public static final String viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$Versions.lifecycle"
            public static final String liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$Versions.lifecycle"
            public static final String process = "androidx.lifecycle:lifecycle-process:$Versions.lifecycle"
        }
    }

    static class threeten {
        public static final String androidBackport = "com.jakewharton.threetenabp:threetenabp:$Versions.threetenabp"
        public static final String backport = "org.threeten:threetenbp:$Versions.threetenbp"
    }

    static class dagger {
        public static final String dagger = "com.google.dagger:dagger:$Versions.dagger"
        public static final String android = "com.google.dagger:dagger-android:$Versions.dagger"
        public static final String compiler = "com.google.dagger:dagger-compiler:$Versions.dagger"
        public static final String androidProcessor = "com.google.dagger:dagger-android-processor:$Versions.dagger"
    }

    static class kotlin {
        public static final String stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$Versions.kotlin"

        static class coroutines {
            public static final String core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$Versions.coroutines"
            public static final String android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$Versions.coroutines"
        }
    }

    static class test {
        public static final String junit = "junit:junit:$Versions.junit"
        public static final String assertj = "org.assertj:assertj-core:$Versions.assertj"

        static class kotlin {
            public static final String reflect = "org.jetbrains.kotlin:kotlin-reflect:$Versions.kotlin"
            public static final String coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$Versions.coroutines"
            public static final String mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:$Versions.mockitoKotlin"
        }

        static class androidx {
            public static final String core = "androidx.test:core-ktx:$Versions.androidxCore"
            public static final String junit = "androidx.test.ext:junit-ktx:$Versions.junitx"
        }

        public static final String robolectric = "org.robolectric:robolectric:$Versions.robolectric"

        static class espresso {
            public static final String core = "androidx.test.espresso:espresso-core:$Versions.espresso"
            public static final String intents = "androidx.test.espresso:espresso-intents:$Versions.espresso"
        }
    }
}