load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "subApp",
    srcs = ["SubApp.java"],
    main_class = "com.example.myproject.subpackage.SubApp",
    deps = ["@maven//:com_google_guava_guava", "//:greeting"],
)