package com.boxboat.jenkins.library.deployTarget

interface IDeployTarget {

    void withCredentials(Closure closure)

}
