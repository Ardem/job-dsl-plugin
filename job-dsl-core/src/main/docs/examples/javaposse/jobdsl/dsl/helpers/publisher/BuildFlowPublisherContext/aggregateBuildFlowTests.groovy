buildFlowJob('example') {
    publishers {
        aggregateBuildFlowTests()
    }
}