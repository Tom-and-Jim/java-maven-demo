load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-maven-lib",
    srcs = glob(["*.java"]),
    deps = ["@maven//:com_google_guava_guava"],
)

java_library(
    name = "greeting",
    srcs = glob(["Greeting.java"]),
)

java_binary(
    name = "java-maven",
    main_class = "com.example.myproject.bazel.BazelApp",
    runtime_deps = [":java-maven-lib"],
)