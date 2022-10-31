load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-guice-lib",
    srcs = glob(["*.java", "bean/*.java", "bean/*/*.java", "bean/*/*/*.java", "intecerptor/*.java"]),
    deps = ["@maven//:com_google_inject_guice", "@maven//:javax_inject_javax_inject", "@maven//:aopalliance_aopalliance"],
)

java_binary(
    name = "guice",
    main_class = "com.example.myproject.guice.GuiceApp",
    runtime_deps = [":java-guice-lib"]
)