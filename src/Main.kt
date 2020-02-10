fun main() {
    // Playing with same file modifiers
    val sameFileSample = SameFileSample()
    sameFileSample.usePublicClass()
    sameFileSample.useInternalClass()
    sameFileSample.usePrivateClass()
    sameFileSample.useValuesAndFunctions()
    sameFileSample.checkNestedAndInnerClasses()

    // Playing with same package modifiers
    val samePackageSample = SamePackageSample()
    samePackageSample.usePublicClass()
    samePackageSample.useInternalClass()
    samePackageSample.usePrivateClass()
    samePackageSample.useValuesAndFunctions()
    samePackageSample.checkNestedAndInnerClasses()
}