# These two targets created by me

java_library(
    name = "dagger_all",
    exported_plugins = [":dagger_plugin"],
    visibility = ["//visibility:public"],
    exports = [":com_google_dagger_dagger"],
)

java_plugin(
    name = "dagger_plugin",
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    deps = [
        ":com_google_dagger_dagger",
        ":com_google_dagger_dagger_compiler",
        ":com_google_dagger_dagger_producers",
    ],
)

# The following dependencies were calculated from:
# com.google.dagger:dagger:2.11
# com.google.dagger:dagger-compiler:2.11

java_library(
    name = "com_google_code_findbugs_jsr305",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_code_findbugs_jsr305//jar",
    ],
)

java_library(
    name = "com_google_dagger_dagger_compiler",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_code_findbugs_jsr305//jar",
        "@com_google_dagger_dagger//jar",
        "@com_google_dagger_dagger_compiler//jar",
        "@com_google_dagger_dagger_producers//jar",
        "@com_google_errorprone_javac//jar",
        "@com_google_googlejavaformat_google_java_format//jar",
        "@com_google_guava_guava//jar",
        "@com_squareup_javapoet//jar",
        "@javax_inject_javax_inject//jar",
    ],
)

java_library(
    name = "com_google_dagger_dagger_producers",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_code_findbugs_jsr305//jar",
        "@com_google_dagger_dagger//jar",
        "@com_google_dagger_dagger_producers//jar",
        "@com_google_guava_guava//jar",
        "@javax_inject_javax_inject//jar",
    ],
)

java_library(
    name = "com_google_guava_guava",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_guava_guava//jar",
    ],
)

java_library(
    name = "com_squareup_javapoet",
    visibility = ["//visibility:public"],
    exports = [
        "@com_squareup_javapoet//jar",
    ],
)

java_library(
    name = "com_google_dagger_dagger",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_dagger_dagger//jar",
        "@javax_inject_javax_inject//jar",
    ],
)

java_library(
    name = "javax_inject_javax_inject",
    visibility = ["//visibility:public"],
    exports = [
        "@javax_inject_javax_inject//jar",
    ],
)

java_library(
    name = "com_google_errorprone_javac",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_errorprone_javac//jar",
    ],
)

java_library(
    name = "com_google_googlejavaformat_google_java_format",
    visibility = ["//visibility:public"],
    exports = [
        "@com_google_errorprone_javac//jar",
        "@com_google_googlejavaformat_google_java_format//jar",
        "@com_google_guava_guava//jar",
    ],
)
