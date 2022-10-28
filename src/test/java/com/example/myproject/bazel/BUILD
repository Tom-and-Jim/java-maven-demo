load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "tests",
    srcs = glob(["*.java"]),
    test_class = "TestBazelApp",
    deps = [
        "//src/main/java/com/example/myproject/bazel:java-maven-lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)
