load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "subApp",
    srcs = ["SubApp.java"],
    main_class = "com.example.myproject.bazel.subpackage.SubApp",
    deps = ["@maven//:com_google_guava_guava", "//src/main/java/com/example/myproject/bazel:greeting"],
)